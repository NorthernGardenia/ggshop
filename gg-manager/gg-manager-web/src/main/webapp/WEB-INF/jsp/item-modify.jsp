<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<script>
    <%--var my_desc = ${item.itemDesc.itemDesc};--%>
</script>
<div class="easyui-panel" title="商品详情" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">商品类目：</td>
                <td>
                    <input id="cid" name="cid" style="width:200px;">
                </td>
            </tr>
            <<input type="hidden" name="id" value="${item.item.id }">
            <tr>
                <td class="label">商品标题：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="title" name="title"
                          data-options="required:true" style="width:100%" value="${item.item.title}">
                </td>
            </tr>
            <tr>
                <td class="label">商品卖点：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="sellPoint" name="sellPoint"
                           data-options="validType:'length[0,150]',multiline:true" style="width:100%;height:60px;" value="${item.item.sellPoint}">
                </td>
            </tr>
            <tr>
                <td class="label">商品价格：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="priceView" name="priceView"
                           data-options="required:true,min:0,precision:2" value="${item.item.price/100}">
                    <input type="hidden" id="price" name="price">
                </td>
            </tr>
            <tr>
                <td class="label">商品库存：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="num" name="num"
                           data-options="required:true,min:0,precision:0" value="${item.item.num}">
                </td>
            </tr>
            <tr>
                <td class="label">条形码：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="barcode" name="barcode"
                           data-options="validType:'length[0,30]'">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <!-- 加载编辑器的容器 -->
                    <script id="container" name="content" type="text/plain" >213</script>
                </td>
            </tr>

            <tr class="paramsShow" style="display:none;">
                <td class="label">商品规格：</td>
                <td>

                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                    <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>
        </table>
        <input name="paramData" id="paramData" style="display:none;">
    </form>
</div>
<script>

    <%--$("#container").html(${item.itemDesc.itemDesc});--%>
    var eu = UE.getEditor('container',{
        initialFrameWidth:'100%',
        initialFrameHeight:'300',
        serverUrl:'file/upload'
    });
//    eu.execCommand('inserthtml',111);

    //提交时间
    function submitForm(){
        $("#itemAddForm").form('submit',{
            url:'item_add',
            onSubmit:function () {
                $('#price').val($('#priceView').val()*100);
                console.log('this is validate--->');
                //获取参数规格部分
                var paramsJson = [];
                var $liList = $('#itemAddForm .paramsShow li');
                $liList.each(function (i, e) {
                    $group = $(e).find('.group');
                    var groupName = $group.text();

                    var params = [];
                    var $trParams = $(e).find('tr').has('td.param');
                    $trParams.each(function (_i, _e) {
                        var $oneDataTr = $(_e);
                        var $keyTd = $oneDataTr.find('.param');
                        var $valueInput = $keyTd.next('td').find('input');
                        var key = $keyTd.text();
                        var value = $valueInput.val();

                        var _o = {
                            k: key,
                            v: value
                        };
                        params.push(_o);
                    });
                    var o = {};
                    o.group = groupName;
                    o.params = params;
                    paramsJson.push(o);
                });
                paramsJson = JSON.stringify(paramsJson);
                $('#paramData').val(paramsJson);
                return $("#itemAddForm").form('validate');
            },
            success:function (data) {
                console.log('submit success');
                if(data>1){
                    $.messager.alert('成功','添加数据成功');
                    ddshop.closeTabs('新增商品');
                    ddshop.addTabs('查询商品','item-list');
                }
            }
        })
    }

    $("#cid").combotree({
        url:"itemCats?parentId=0",
        required:true,
        onBeforeExpand:function (node) {
            console.log(node);
            console.log("------>");

            var $currentTree = $("#cid").combotree('tree');
            console.log($currentTree);
            var tree_options = $currentTree.tree('options');
            console.log(tree_options);
            tree_options.url = 'itemCats?parentId='+node.id;

        },
        onBeforeSelect:function (node) {
            var isLeaf = $("#cid").tree('isLeaf',node.target);
            if(!isLeaf){
                $.messager.alert('警告','选择的类目下还有其他子类目','warning');
                return false;
            }else{

                console.log(node);
                //如果是叶子节点就发送ajax请求，请求查询tb_item_param
                $.get(
                    //url
                    'itemParam/showItemParam/'+node.id,
                    //success
                    function(data){
                        //console.log(typeof(data));
                        var $outerTd = $('#itemAddForm .paramsShow td').eq(1);
                        var $ul = $('<ul>');
                        $outerTd.empty().append($ul);
                        if (data) {
                            var paramData = data.paramData;
                            paramData = JSON.parse(paramData);
                            //遍历分组
                            $.each(paramData, function (i, e) {
                                var groupName = e.group;
                                var $li = $('<li>');
                                var $table = $('<table>');
                                var $tr = $('<tr>');
                                var $td = $('<td colspan="2" class="group">' + groupName + '</td>');

                                $ul.append($li);
                                $li.append($table);
                                $table.append($tr);
                                $tr.append($td);

                                //遍历分组项
                                if (e.params) {
                                    $.each(e.params, function (_i, paramName) {
                                        var _$tr = $('<tr><td class="param">' + paramName + '</td><td><input></td></tr>');
                                        $table.append(_$tr);
                                    });
                                }
                            });

                            $("#itemAddForm .paramsShow").show();
                        } else {

                            $("#itemAddForm .paramsShow").hide();
                            $("#itemAddForm .paramsShow td").eq(1).empty();//第二个td
                        }


                    }
                );
            }
        }

    });
    /**
     * 解决不了。
     */
    $(function(){
        eu.setContent('<p>new text</p>', true);
    })
</script>
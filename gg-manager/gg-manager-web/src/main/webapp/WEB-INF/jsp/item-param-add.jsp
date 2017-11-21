<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2017/11/20
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="商品规格参数模板详情" data-options="fit:true">

    <form class="form" id="itemParamAddForm" name="itemParamAddForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">商品类目：</td>
                <td>
                    <input id="cid" name="cid" style="width:200px;">
                </td>
            </tr>
            <tr>
                <td class="label">规格参数：</td>
                <td>
                    <button class="easyui-linkbutton" onclick="addGroup()" type="button"
                            data-options="iconCls:'icon-add'">添加分组
                    </button>
                    <ul id="item-param-group">

                    </ul>

                    <%--隐藏域--%>
                    <ul id="item-param-group-template" style="display:none;">
                        <li>
                            <%--组名--%>
                            <input name="group">
                            <button title="添加参数" class="easyui-linkbutton" onclick="addParam(this)" type="button"
                                    data-options="iconCls:'icon-add'"></button>
                            <button title="删除分组" class="easyui-linkbutton" onclick="delGroup(this)" type="button"
                                    data-options="iconCls:'icon-cancel'"></button>
                                <%--组内参数--%>
                            <ul class="item-param">
                                <li>
                                    <input name="param">
                                    <button title="删除参数" class="easyui-linkbutton" onclick="delParam(this)"
                                            type="button" data-options="iconCls:'icon-cancel'"></button>
                                </li>

                            </ul>
                        </li>
                    </ul>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button class="easyui-linkbutton" onclick="submitForm()" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                    <button class="easyui-linkbutton" onclick="clearForm()" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>
        </table>
    </form>
</div>

<script>
    
    //添加组
    function addGroup() {
        $addGroupLi=$('#item-param-group-template li').eq(0).clone();
        $('#item-param-group').append($addGroupLi);
    }

    //删除分组
    function delGroup(ele) {
        $(ele).parent().remove();
    }
    
    //添加参数
    function addParam(ele) {
        $addParamLi=$("#item-param-group-template .item-param li").eq(0).clone();
        $(ele).parent().find('.item-param').append($addParamLi);
    }

    //删除参数
    function delParam(ele) {
        $(ele).parent().remove();
    }


    //保存（将规格参数添加数据库）
    function submitForm() {
        //存放group和param
        var groupValues=[];

        //先取出所有组
        var $groups = $('#item-param-group [name=group]');
        //遍历分组
        $groups.each(function (index, ele) {

            //遍历分组项
            var paramValues = [];
            var $params = $(ele).parent().find(".item-param [name=param]");
            //遍历参数项
            $params.each(function (_index, _ele) {
                var _val = $(_ele).val();
                if ($.trim(_val).length > 0) {
                    paramValues.push(_val);
                }
            });

            //把group合param封装到一起
            var val = $(ele).val();  //group的值
            var o = {};
            o.group = val;
            o.params = paramValues;

            if($.trim(val).length>0&&paramValues.length>0) {
                //得到封装好的规格参数json
                groupValues.push(o);
            }

        });

        //发送ajax请求保存数据
        var cid=$('#cid').combotree('getValue');
        var url='item/param/save/'+cid;
        var jsonStr=JSON.stringify(groupValues)
        $.post(
            url,
            {paramData:jsonStr},
            function (data) {
                //console.log(data);
                if(data>0){
                    $.messager.alert('消息','保存成功！','info');
                    ddshop.addTabs('规格参数', 'itemParams');
                }
            }
        )

    }




</script>




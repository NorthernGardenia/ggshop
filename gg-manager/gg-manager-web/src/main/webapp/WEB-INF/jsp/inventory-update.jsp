<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="库存修改" data-options="fit:true">
    <form class="itemForm" id="itemUpdateForm" name="itemUpdateForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">商品编号：</td>
                <td>
                    <input id="itemId" name="itemId" value="${inventory.itemId}" style="width:200px;">
                </td>
            </tr>
            <tr>
                <td class="label">销量：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="sellNum" name="sellNum" value="${inventory.sellNum}"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td class="label">库存总量：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="itemTotal" name="itemTotal" value="${inventory.itemTotal}"
                           data-options="required:true,min:0,precision:2">
                    <!--<input type="hidden" id="price" name="price">-->
                </td>
            </tr>
            <tr>
                <td class="label">剩余库存：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="itemNum" name="itemNum" value="${inventory.itemNum}"
                           data-options="required:true,min:0,precision:0">
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <button onclick="submitUpdateForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                    <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>
        </table>
       <%-- <input name="paramData" id="paramData" style="display:none;">--%>
    </form>
</div>

<script>
   function submitUpdateForm(){
        $('#itemUpdateForm').form('submit',{
            //提交表单到item进行处理
            url:'inventory/update',
            //在表单提交之前触发
         /* onSubmit:function () {
                return $(this).form('validate');
            },*/
            //后台处理成功之后的回调函数
            success:function(data){
                if(data > 0) {
                    $.messager.alert('温馨提示','修改成功！');
                   // $('#tab').tabs('close', '修改库存');
                   // ddshop.addTabs('查看商品库存', 'inventory-list');
                }
            }
        });
    }

function submitForm() {
    var itemId = $("#itemId").val();
    var sellNum= $("#sellNum").val();
    var itemTotal = $("#itemTotal").val();
    var itemNum = $("#itemNum").val();
    //var inventory = {'itemId':itemId,'sellNum':sellNum,'itemTotal':itemTotal,'itemNum':itemNum};
//    $.post(
//        'inventory/update',
//        {'itemId':itemId,'sellNum':sellNum,'itemTotal':itemTotal,'itemNum':itemNum},
//        function (data) {
//            if(data>0){
//                $.messager.alert('温馨提示','修改成功！');
//                $('#tab').tabs('close', '修改库存');
//                ddshop.addTabs('查看商品库存', 'inventory-list');
//            }
//        }
//    )
  /*  $.ajax({
        url:'inventory/update',
        type: 'POST',
        data: JSON.stringify({
            'itemId':itemId,
            'sellNum':sellNum,
            'itemTotal':itemTotal,
            'itemNum':itemNum
        }),
       // contentType: "application/json; charset=utf-8",
        success:function(data) {
            if(data>0){
                $.messager.alert('温馨提示','修改成功！');
                $('#tab').tabs('close', '修改库存');
                ddshop.addTabs('查看商品库存', 'inventory-list');
            }
        }
    });*/
}
</script>


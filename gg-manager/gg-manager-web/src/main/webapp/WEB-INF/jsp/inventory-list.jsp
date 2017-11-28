<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<div id="toolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>商品标题：</label>
        <input class="easyui-textbox" type="text" id="title" value="${inventory.itemId}">
        <label>商品状态：</label>
        <select id="status" class="easyui-combobox">
            <option value="0">全部</option>
            <option value="1">正常</option>
            <option value="2">冻结</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
        <%--<a onclick="searchForm()" class="easyui-linkbutton">搜索</a>--%>
    </div>
    <div>
      <!--  <button onclick="freeze()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">冻结</button>
        <button onclick="unfreeze()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">解冻</button>-->
        <button onclick="editParam()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">编辑</button>
    </div>
</div>

<table id="dg"></table>
<script>

    function editParam() {
        var selection = $('#dg').datagrid('getSelections');
        //console.log(inventory);
        if(selection.length==0){
            $.messager.alert('提示','老哥,好歹选一条记录吧');
            return;
        }else if(selection>1){
            $.messager.alert('提示','最多只能选择一条');
            return;
        }
        $.messager.confirm('确认','你确认想要修改该库存吗',function (r) {
            if(r){
                var inventory = selection[0].itemId;

                console.log(inventory);
                ggshop.addTabs('修改库存', 'inventoryUpdate/'+inventory);
                /*$.post(
                    'inventory/to',
                    {'inventory':JSON.stringify(inventory)}
                )*/
            }
        })
    }
    $('#dg').datagrid({
        url:"inventory",

        //添加分页组件
        pagination:true,

        //允许多行排序
        multiSort:true,

        //使得数据表格自适应填充父容器
        fit:true,

        //每行都显示行号
        rownumbers:true,

        //隔行换色
        striped:true,

        //添加工具栏
        toolbar:'#toolbar',

        //初始化页面显示的条数
        pageSize:20,

        //分页条数列表
        pageList:[10,20,50,100],
        //列属性
        columns: [[
            //field title width列属性
            {field:'ck',checkbox:true},
            {field:'itemId',title:'商品编号',width:100,sortable:true},
            {field:'sellNum',title:'销量',width:100},
            {field:'itemNum',title:'剩余库存',width:100,},
            {field:'itemTotal',title:'库存总量',width:100},
            //使用moment来格式化时间
            {field:'gmtCreate',title:'创建时间',width:100,formatter:function (value,row,index){
                return moment(value).format("LL");
            } },
            {field:'gmtModified',title:'修改时间',width:100,formatter:function (value,row,index){
                return moment(value).format("LL");
            } }
        ]]
    });


</script>

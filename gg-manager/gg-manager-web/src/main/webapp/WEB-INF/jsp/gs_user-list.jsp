<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<div id="toolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>用户名：</label>
        <input class="easyui-textbox" type="text" id="username">
        <label>用户状态：</label>
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
        <button onclick="freeze()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">冻结</button>
        <button onclick="unfreeze()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">解冻</button>
        <button onclick="editParam()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">编辑</button>
    </div>
</div>

<table id="dg"></table>
<script>
    function editParam() {
       alert("编辑用户信息") 
    }
    
    function searchForm() {
        $('#dg').datagrid('load',{
            username:$('#username').val(),
            status:$('#status').combobox('getValue')
        });
    }
    
    //冻结
    function freeze() {
        var selections = $('#dg').datagrid('getSelections');
        if(selections.length==0){
            $.messager.alert('提示','请选一条记录');
            return;
        }
        $.messager.confirm('确认','你确认想要冻结用户吗?',function (r) {
            if(r){
                var ids = [];
                for(var i=0;i<selections.length;i++){
                    ids.push(selections[i].id);
                }

                $.post(
                    'items/freeze',
                    {'ids[]':ids},
                    function (data) {
                        $('#dg').datagrid('reload');
                    },
                    'json'
                )
            }
        })
    }



    $('#dg').datagrid({
        url:"gsUsers",

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
            {field:'id',title:'用户编号',width:100,sortable:true},
            {field:'username',title:'用户姓名',width:100,sortable:true},
            {field:'phone',title:'用户电话',width:100},
            {field:'status',title:'状态',width:100,formatter:function(value,row,index){
                switch (value){
                    case 1:
                        return "正常";
                        break;
                    case 2:
                        return "冻结";
                        break;
                }
            }},
            {field:'email',title:'用户邮箱',width:100},
            {field:'isAdmin',title:'用户权限',width:100},
            {field:'rank',title:'用户等级',width:100},
            {field:'address',title:'用户地址',width:100},
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

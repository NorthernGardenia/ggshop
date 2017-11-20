<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<div id="toolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>商品标题：</label>
        <input class="easyui-textbox" type="text" id="title">
        <label>商品状态：</label>
        <select id="status" class="easyui-combobox">
            <option value="0">全部</option>
            <option value="1">正常</option>
            <option value="2">下架</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
        <%--<a onclick="searchForm()" class="easyui-linkbutton">搜索</a>--%>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
        <button onclick="down()" class="easyui-linkbutton" data-options="iconCls:'icon-down',plain:true">下架</button>
        <button onclick="up()" class="easyui-linkbutton" data-options="iconCls:'icon-up',plain:true">上架</button>
    </div>
</div>

<table id="dg"></table>
<script>
    $('#dg').datagrid({
        url:"items",

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
            {field:'id',title:'商品编号',width:100,sortable:true},
            {field:'title',title:'商品名称',width:100,sortable:true},
            {field:'catName',title:'分类名称',width:100},
            {field:'status',title:'状态',width:100,formatter:function(value,row,index){
                switch (value){
                    case 1:
                        return "正常";
                        break;
                    case 2:
                        return "下架";
                        break;
                    case 3:
                        return "删除";
                        break;
                }
            }},
            //格式化一下价格
            {field:'price',title:'价格',width:100,formatter:function(value,row,index){
                return "￥"+(value/100).toFixed(2);
            }},
            {field:'sellPoint',title:'卖点',width:100},
            {field:'num',title:'数量',width:100},
            {field:'image',title:'图片',width:100},
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

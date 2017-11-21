<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2017/11/20
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%--工具条--%>
<div id="paramtoolbar">
    <div>
        <button type="button" onclick="addParam()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button type="button" onclick="editParam()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button type="button" onclick="deleteParam()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>
<%--数据表--%>
<table id="itemParamList"></table>
<script>
//    初始化数据表格，将数据库中的数据查询并显示在页面上
    $('#itemParamList').datagrid({
        title:'规格参数列表',
        url:'listItemParams',
        fit:true,
        rownumbers:true,
        pagination:true,
        pageSize:10,
        toolbar:'#paramtoolbar',
        columns:[[
            {field:'ck', checkbox: true},
            {field:'id',title:'ID', sortable: true},
            {field:'itemCatName',title:'商品类目'},
            {field:'paramData',title:'规格(只显示分组名称)', formatter:function(value,row,index){
                //console.log(typeof(value));//String
                //String--Object把字符串反序列化成对象
                var obj = JSON.parse(value);
                //console.log(typeof(obj));
                var arr = [];
                //遍历对象 @i是索引@e是对象
                $.each(obj,function(i,e){
                    arr.push(e.group)
                });
                return arr;
            }},
            {field:'gmtCreate',title:'创建日期', formatter:function(value,row,index){
                return moment(value).format('YYYY年MM月DD日,hh:mm:ss');
            }},
            {field:'gmtModified',title:'更新日期', formatter:function(value,row,index){
                return moment(value).format('YYYY年MM月DD日,hh:mm:ss');
            }}
        ]]
    });


    //新增分组
    function addParam(){
        ggshop.addTabs('新增商品规格模板', 'item-param-add')
    }


</script>
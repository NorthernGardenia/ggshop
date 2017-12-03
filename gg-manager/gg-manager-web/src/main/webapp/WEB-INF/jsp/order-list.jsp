<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<div id="toolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>订单号：</label>
        <input class="easyui-textbox" type="text" id="order_id">
        <label>用户名：</label>
        <input class="easyui-textbox" type="text" id="username">
        <label>支付状态：</label>
        <select id="status" class="easyui-combobox">
            <option value="0">请选择</option>
            <option value="1">未付款</option>
            <option value="2">已付款</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
        <%--<a onclick="searchForm()" class="easyui-linkbutton">搜索</a>--%>
    </div>
</div>

<table id="dg"></table>
<script>

    //搜索
    function searchForm() {
        $("#dg").datagrid('load', {
            orderId:$('#order_id').val(),
            username:$('#username').val(),
            status:$('#status').combobox('getValue')
        });
    }


    //将数据显示到页面上
    $('#dg').datagrid({
        url:"orders",

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
            {field:'orderId',title:'订单号',width:100,sortable:true},
            {field:'shopingCode',title:'物流单号',width:100,sortable:true},
            {field:'itemname',title:'商品名',width:100},
            {field:'username',title:'用户名',width:100},
            {field:'buyerMessage',title:'用户留言',width:100},
            {field:'status',title:'支付状态',width:100,formatter:function(value,row,index){
                switch (value){
                    case 1:
                        return "未付款";
                        break;
                    case 2:
                        return "已付款";
                        break;
                }
            }},
            {field:'num',title:'数量',width:100},
            //格式化一下价格
            {field:'price',title:'价格',width:100,formatter:function(value,row,index){
                return "￥"+(value/1).toFixed(2);
            }},
            //总价
            {field:'totalFee',title:'总价',width:100,formatter:function(value,row,index){
                return "￥"+(value/1).toFixed(2);
            }},
            //实际支付
            {field:'payment',title:'实际支付',width:100,formatter:function(value,row,index){
                return "￥"+(value/1).toFixed(2);
            }},
            {field:'receiverName',title:'收件人',width:100},
            {field:'receiverMobile',title:'联系方式',width:100},
            {field:'receiverPrvc',title:'所在省',width:100},
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

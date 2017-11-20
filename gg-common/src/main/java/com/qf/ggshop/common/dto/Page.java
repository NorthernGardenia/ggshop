package com.qf.ggshop.common.dto;

/**
 * 分页
 * 封装分页请求的参数类
 */
public class Page {
    //当前页的页码
    private int page;
    //没页显示的数量
    private int rows;
    //偏移量，当前页的第一条数据的索引值
    //private int offset;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }


    //获取偏移量，不需要手动授值
    public int getOffset(){
        return (page-1)*rows;
    }

    /*public void setOffset(int offset) {
        this.offset = offset;
    }*/
}
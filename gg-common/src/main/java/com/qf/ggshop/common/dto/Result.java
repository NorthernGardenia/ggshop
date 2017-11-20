package com.qf.ggshop.common.dto;

import java.util.List;

/**
 * 分页
 * 封装响应请求的对象的集合
 * @param <T>
 */
public class Result<T> {
    //符合条件的总个数
    private int total;
    //指定页码的对象的集合
    private List<T> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
package com.qf.ggshop.common.dto;

import java.util.List;

public class Result<T> {

    //符合条件的记录数
    private int total;

    //zhid指定页码显示的记录集合

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

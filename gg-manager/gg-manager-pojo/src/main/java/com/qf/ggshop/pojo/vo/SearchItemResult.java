package com.qf.ggshop.pojo.vo;

import java.util.List;

public class SearchItemResult {

    private  long recordCount;
    private  int totalPages;
    private List<ItemSearchCustom> itemList;


    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<ItemSearchCustom> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemSearchCustom> itemList) {
        this.itemList = itemList;
    }
}

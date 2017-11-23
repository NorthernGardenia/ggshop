package com.qf.ggshop.pojo.vo;

import com.qf.ggshop.pojo.po.Item;
import com.qf.ggshop.pojo.po.ItmeDesc;

public class ItemCustom extends Item {

    private  String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}

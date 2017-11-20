package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.GsOrderShopping;
import com.qf.ggshop.pojo.po.GsOrderShoppingExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GsOrderShoppingMapper {
    int countByExample(GsOrderShoppingExample example);

    int deleteByExample(GsOrderShoppingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(GsOrderShopping record);

    int insertSelective(GsOrderShopping record);

    List<GsOrderShopping> selectByExample(GsOrderShoppingExample example);

    GsOrderShopping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") GsOrderShopping record, @Param("example") GsOrderShoppingExample example);

    int updateByExample(@Param("record") GsOrderShopping record, @Param("example") GsOrderShoppingExample example);

    int updateByPrimaryKeySelective(GsOrderShopping record);

    int updateByPrimaryKey(GsOrderShopping record);
}
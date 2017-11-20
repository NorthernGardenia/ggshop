package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.GsOrderItem;
import com.qf.ggshop.pojo.po.GsOrderItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GsOrderItemMapper {
    int countByExample(GsOrderItemExample example);

    int deleteByExample(GsOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(GsOrderItem record);

    int insertSelective(GsOrderItem record);

    List<GsOrderItem> selectByExample(GsOrderItemExample example);

    GsOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GsOrderItem record, @Param("example") GsOrderItemExample example);

    int updateByExample(@Param("record") GsOrderItem record, @Param("example") GsOrderItemExample example);

    int updateByPrimaryKeySelective(GsOrderItem record);

    int updateByPrimaryKey(GsOrderItem record);
}
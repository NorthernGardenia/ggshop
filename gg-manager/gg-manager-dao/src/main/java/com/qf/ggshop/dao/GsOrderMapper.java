package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.GsOrder;
import com.qf.ggshop.pojo.po.GsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GsOrderMapper {
    int countByExample(GsOrderExample example);

    int deleteByExample(GsOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(GsOrder record);

    int insertSelective(GsOrder record);

    List<GsOrder> selectByExample(GsOrderExample example);

    GsOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") GsOrder record, @Param("example") GsOrderExample example);

    int updateByExample(@Param("record") GsOrder record, @Param("example") GsOrderExample example);

    int updateByPrimaryKeySelective(GsOrder record);

    int updateByPrimaryKey(GsOrder record);
}
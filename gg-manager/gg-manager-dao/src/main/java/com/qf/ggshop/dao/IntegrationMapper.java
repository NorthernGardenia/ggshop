package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.Integration;
import com.qf.ggshop.pojo.po.IntegrationExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IntegrationMapper {
    int countByExample(IntegrationExample example);

    int deleteByExample(IntegrationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Integration record);

    int insertSelective(Integration record);

    List<Integration> selectByExample(IntegrationExample example);

    Integration selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Integration record, @Param("example") IntegrationExample example);

    int updateByExample(@Param("record") Integration record, @Param("example") IntegrationExample example);

    int updateByPrimaryKeySelective(Integration record);

    int updateByPrimaryKey(Integration record);
}
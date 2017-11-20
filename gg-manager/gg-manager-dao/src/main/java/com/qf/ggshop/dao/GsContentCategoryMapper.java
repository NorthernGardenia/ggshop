package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.GsContentCategory;
import com.qf.ggshop.pojo.po.GsContentCategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GsContentCategoryMapper {
    int countByExample(GsContentCategoryExample example);

    int deleteByExample(GsContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GsContentCategory record);

    int insertSelective(GsContentCategory record);

    List<GsContentCategory> selectByExample(GsContentCategoryExample example);

    GsContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GsContentCategory record, @Param("example") GsContentCategoryExample example);

    int updateByExample(@Param("record") GsContentCategory record, @Param("example") GsContentCategoryExample example);

    int updateByPrimaryKeySelective(GsContentCategory record);

    int updateByPrimaryKey(GsContentCategory record);
}
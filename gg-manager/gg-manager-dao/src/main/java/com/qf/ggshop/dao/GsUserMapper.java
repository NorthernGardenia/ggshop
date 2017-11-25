package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.GsUser;
import com.qf.ggshop.pojo.po.GsUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GsUserMapper {
    int countByExample(GsUserExample example);

    int deleteByExample(GsUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GsUser record);

    int insertSelective(GsUser record);

    List<GsUser> selectByExample(GsUserExample example);

    GsUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GsUser record, @Param("example") GsUserExample example);

    int updateByExample(@Param("record") GsUser record, @Param("example") GsUserExample example);

    int updateByPrimaryKeySelective(GsUser record);

    int updateByPrimaryKey(GsUser record);

}
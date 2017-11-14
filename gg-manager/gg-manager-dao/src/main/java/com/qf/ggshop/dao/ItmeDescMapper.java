package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.ItmeDesc;
import com.qf.ggshop.pojo.po.ItmeDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItmeDescMapper {
    int countByExample(ItmeDescExample example);

    int deleteByExample(ItmeDescExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(ItmeDesc record);

    int insertSelective(ItmeDesc record);

    List<ItmeDesc> selectByExampleWithBLOBs(ItmeDescExample example);

    List<ItmeDesc> selectByExample(ItmeDescExample example);

    ItmeDesc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") ItmeDesc record, @Param("example") ItmeDescExample example);

    int updateByExampleWithBLOBs(@Param("record") ItmeDesc record, @Param("example") ItmeDescExample example);

    int updateByExample(@Param("record") ItmeDesc record, @Param("example") ItmeDescExample example);

    int updateByPrimaryKeySelective(ItmeDesc record);

    int updateByPrimaryKeyWithBLOBs(ItmeDesc record);

    int updateByPrimaryKey(ItmeDesc record);
}
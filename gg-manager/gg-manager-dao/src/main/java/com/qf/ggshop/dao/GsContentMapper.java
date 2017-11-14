package com.qf.ggshop.dao;

import com.qf.ggshop.pojo.po.GsContent;
import com.qf.ggshop.pojo.po.GsContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GsContentMapper {
    int countByExample(GsContentExample example);

    int deleteByExample(GsContentExample example);

    int insert(GsContent record);

    int insertSelective(GsContent record);

    List<GsContent> selectByExampleWithBLOBs(GsContentExample example);

    List<GsContent> selectByExample(GsContentExample example);

    int updateByExampleSelective(@Param("record") GsContent record, @Param("example") GsContentExample example);

    int updateByExampleWithBLOBs(@Param("record") GsContent record, @Param("example") GsContentExample example);

    int updateByExample(@Param("record") GsContent record, @Param("example") GsContentExample example);
}
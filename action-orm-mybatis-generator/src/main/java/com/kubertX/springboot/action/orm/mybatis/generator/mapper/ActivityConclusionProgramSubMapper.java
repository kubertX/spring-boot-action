package com.kubertX.springboot.action.orm.mybatis.generator.mapper;

import com.kubertX.springboot.action.orm.mybatis.generator.model.ActivityConclusionProgramSub;
import com.kubertX.springboot.action.orm.mybatis.generator.model.ActivityConclusionProgramSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityConclusionProgramSubMapper {
    long countByExample(ActivityConclusionProgramSubExample example);

    int deleteByExample(ActivityConclusionProgramSubExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityConclusionProgramSub row);

    int insertSelective(ActivityConclusionProgramSub row);

    List<ActivityConclusionProgramSub> selectByExample(ActivityConclusionProgramSubExample example);

    ActivityConclusionProgramSub selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") ActivityConclusionProgramSub row, @Param("example") ActivityConclusionProgramSubExample example);

    int updateByExample(@Param("row") ActivityConclusionProgramSub row, @Param("example") ActivityConclusionProgramSubExample example);

    int updateByPrimaryKeySelective(ActivityConclusionProgramSub row);

    int updateByPrimaryKey(ActivityConclusionProgramSub row);
}
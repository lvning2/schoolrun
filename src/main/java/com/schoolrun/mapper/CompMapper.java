package com.schoolrun.mapper;

import com.schoolrun.entity.Comp;
import com.schoolrun.entity.CompExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompMapper {
    //改变111111
    int countByExample(CompExample example);

    int deleteByExample(CompExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Comp record);

    int insertSelective(Comp record);

    List<Comp> selectByExample(CompExample example);

    Comp selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Comp record, @Param("example") CompExample example);

    int updateByExample(@Param("record") Comp record, @Param("example") CompExample example);

    int updateByPrimaryKeySelective(Comp record);

    int updateByPrimaryKey(Comp record);
}

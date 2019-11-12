package com.schoolrun.mapper;


import java.util.List;

import com.schoolrun.entity.Admain;
import com.schoolrun.entity.AdmainExample;
import org.apache.ibatis.annotations.Param;

public interface AdmainMapper {


    int countByExample(AdmainExample example);

    int deleteByExample(AdmainExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Admain record);

    int insertSelective(Admain record);

    List<Admain> selectByExample(AdmainExample example);

    Admain selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Admain record, @Param("example") AdmainExample example);

    int updateByExample(@Param("record") Admain record, @Param("example") AdmainExample example);

    int updateByPrimaryKeySelective(Admain record);

    int updateByPrimaryKey(Admain record);
}
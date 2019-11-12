package com.schoolrun.mapper;

import com.schoolrun.entity.Data;
import com.schoolrun.entity.EomsBaseSheet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

@Mapper
public interface EomsMapper {

    @Select("select * from eoms_base_sheet where sheetid=#{sheetid}")
    EomsBaseSheet selectBasesheetid(String sheetid);

    @Update("update eoms_sheet_perfaultsheet set faultreason='001001',replyfaultreasonclassify='系统' where basesheetid=#{id}")
    void updatePerfaultsheet(BigDecimal id);   //4G性能工单

    @Update("update eoms_sheet_faultsheet set alertdeal=#{alertdeal} where basesheetid=#{basesheetid}")
    void updateFaultSheet(String basesheetid,String alertdeal);    //故障处理工单


    //@Select("select * from eoms_base_sheet_operlog where basesheetid=#{basesheetid}")
    //ArrayList<EomsBaseSheetOperlog> selectOperlog(BigDecimal basesheetid);  //查询工单的流水记录

    @Select("select * from (select o.id from eoms_base_sheet_operlog o where o.basesheetid=#{basesheetid} order by o.id asc ) C where rownum=1")
    BigDecimal select(String basesheetid);    //根据basesheetid查询工单的第一条流水


    @Select("select s.sheetid sheetid,se.statename statename,d.firstlevel firstleavel from eoms_base_sheet s, eoms_sheet_faultsheet f,eoms_sheet_state se,gpm_dicdetail d where s.id=f.basesheetid and s.sheetstate=se.id and f.networktype=d.code and d.dictypeid=241 and s.sheetid=#{id}")
    Data get(String id);




}


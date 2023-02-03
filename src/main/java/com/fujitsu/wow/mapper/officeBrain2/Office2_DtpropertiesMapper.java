package com.fujitsu.wow.mapper.officeBrain2;

import com.fujitsu.wow.pojo.officeBrain2.Office2_Dtproperties;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Office2_DtpropertiesMapper {


    List<Office2_Dtproperties> getAll();

}

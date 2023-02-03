package com.fujitsu.wow.mapper.officeBrain2;

import com.fujitsu.wow.pojo.officeBrain2.Office2_CCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Office2_CCategoryMapper {
    List<Office2_CCategory> getAll();

    int insert(Office2_CCategory office2CCategory);

    Office2_CCategory getBycategoryCD(@Param("categoryCD") String categoryCD);

    int updateBycategoryCD(Office2_CCategory office2CCategory);

    int deleteByCategoryCD(@Param("categoryCD") String categoryCD);
}

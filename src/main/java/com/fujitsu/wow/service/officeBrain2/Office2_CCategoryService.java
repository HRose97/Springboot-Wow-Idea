package com.fujitsu.wow.service.officeBrain2;

import com.fujitsu.wow.pojo.officeBrain2.Office2_CCategory;

import java.util.List;

public interface Office2_CCategoryService {
    //查询全部
    List<Office2_CCategory> getAll();

    //新增
    int insert(Office2_CCategory office2CCategory);

    Office2_CCategory getBycategoryCD(String categoryCD);

    //修改
    int updateBycategoryCD(Office2_CCategory office2CCategory);

    int deleteByCategoryCD(String categoryCD);
}

package com.fujitsu.wow.service.impl.officeBrain2;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.fujitsu.wow.mapper.officeBrain2.Office2_CCategoryMapper;
import com.fujitsu.wow.pojo.officeBrain2.Office2_CCategory;
import com.fujitsu.wow.service.officeBrain2.Office2_CCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@DS("officeBrain2")
public class Office2_CCategoryServiceImpl implements Office2_CCategoryService {


    @Resource
    public Office2_CCategoryMapper office2CCategoryMapper;

    @Override
    public List<Office2_CCategory> getAll() {
        List<Office2_CCategory> list = office2CCategoryMapper.getAll();
        return list;
    }

    //新增
    @Override
    public int insert(Office2_CCategory office2CCategory) {
        int row = office2CCategoryMapper.insert(office2CCategory);
        return row;
    }

    @Override
    public Office2_CCategory getBycategoryCD(String categoryCD) {
        Office2_CCategory ishave = office2CCategoryMapper.getBycategoryCD(categoryCD);
        return ishave;
    }

    @Override
    public int updateBycategoryCD(Office2_CCategory office2CCategory) {
        int row = office2CCategoryMapper.updateBycategoryCD(office2CCategory);
        return row;
    }

    @Override
    public int deleteByCategoryCD(String categoryCD) {
        int row = office2CCategoryMapper.deleteByCategoryCD(categoryCD);
        return row;
    }
}

package com.fujitsu.wow.service.impl.officeBrain2;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.fujitsu.wow.mapper.officeBrain2.Office2_DtpropertiesMapper;
import com.fujitsu.wow.pojo.officeBrain2.Office2_Dtproperties;
import com.fujitsu.wow.service.officeBrain2.Office2_DtpropertiesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@DS("officeBrain2")
@Service
public class Office2_DtpropertiesServiceImpl implements Office2_DtpropertiesService {

    @Resource
    Office2_DtpropertiesMapper office2DtpropertiesMapper;

    @Override
    public List<Office2_Dtproperties> getAll() {
        List<Office2_Dtproperties> list = office2DtpropertiesMapper.getAll();
        return list;
    }
}

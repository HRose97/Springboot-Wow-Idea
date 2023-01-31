package com.fujitsu.wow.service.impl.wincare2;

import com.fujitsu.wow.mapper.wincare2.W2_BumonMapper;
import com.fujitsu.wow.pojo.wincare2.W2_Bumon;
import com.fujitsu.wow.service.wincare2.W2_BumonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class W2_BumonServiceImpl implements W2_BumonService {

    @Resource
    public W2_BumonMapper bumonMapper;
    @Override
    public List<W2_Bumon> getByid() {
        List<W2_Bumon> bumon = bumonMapper.getById(3);
        return bumon;
    }
}

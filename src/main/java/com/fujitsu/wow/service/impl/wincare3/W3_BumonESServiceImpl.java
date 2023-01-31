package com.fujitsu.wow.service.impl.wincare3;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.fujitsu.wow.mapper.wincare3.W3_BumonESMapper;
import com.fujitsu.wow.pojo.wincare3.W3_BumonRS;
import com.fujitsu.wow.service.wincare3.W3_BumonESService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@DS("wincare3")
public class W3_BumonESServiceImpl implements W3_BumonESService {

    @Resource
    public W3_BumonESMapper bumonMapper;
    @Override
    public List<W3_BumonRS> getByid() {
        List<W3_BumonRS> bumon = bumonMapper.getById();
        return bumon;
    }
}

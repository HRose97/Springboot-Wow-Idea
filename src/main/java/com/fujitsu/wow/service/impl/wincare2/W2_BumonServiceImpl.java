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
    public List<W2_Bumon> getAll() {
        List<W2_Bumon> bumon = bumonMapper.getAll();
        return bumon;
    }

    @Override
    public W2_Bumon getByid(Integer id) {
        W2_Bumon byId = bumonMapper.getById(id);
        return byId;
    }

    @Override
    public int bumonInsert(W2_Bumon w2Bumon) {
        int row = bumonMapper.bumonInsert(w2Bumon);
        return row;
    }

    @Override
    public int bumonUpdateById(W2_Bumon w2Bumon) {
        int row = bumonMapper.bumonUpdateById(w2Bumon);
        return row;
    }

    @Override
    public int deleteById(Integer id) {
        int row = bumonMapper.deleteById(id);
        return row;
    }
}

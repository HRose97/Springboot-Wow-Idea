package com.fujitsu.wow.service.wincare2;

import com.fujitsu.wow.pojo.wincare2.W2_Bumon;

import java.util.List;

public interface W2_BumonService {
    List<W2_Bumon> getAll();

    W2_Bumon getByid(Integer id);

    int bumonInsert(W2_Bumon w2Bumon);

    int bumonUpdateById(W2_Bumon w2Bumon);

    int deleteById(Integer id);
}

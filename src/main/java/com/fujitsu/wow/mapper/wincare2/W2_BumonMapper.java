package com.fujitsu.wow.mapper.wincare2;


import com.fujitsu.wow.pojo.wincare2.W2_Bumon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Hzh
 * @since 2022-07-05
 */
@Mapper
public interface W2_BumonMapper {


    W2_Bumon getById(int i);

    List<W2_Bumon> getAll();

    int bumonInsert(W2_Bumon w2Bumon);

    int bumonUpdateById(W2_Bumon w2Bumon);

    int deleteById(Integer id);
}

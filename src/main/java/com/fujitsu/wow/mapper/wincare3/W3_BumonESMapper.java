package com.fujitsu.wow.mapper.wincare3;


import com.fujitsu.wow.pojo.wincare3.W3_BumonRS;
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
public interface W3_BumonESMapper {


    List<W3_BumonRS> getById();
}

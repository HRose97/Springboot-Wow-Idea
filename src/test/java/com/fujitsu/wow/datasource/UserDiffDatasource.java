package com.fujitsu.wow.datasource;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.fujitsu.wow.mapper.wincare2.W2_BumonMapper;
import com.fujitsu.wow.pojo.wincare2.W2_Bumon;
import com.fujitsu.wow.pojo.wincare3.W3_BumonRS;
import com.fujitsu.wow.service.wincare3.W3_BumonESService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * 测试使用不同的数据源，库名
 *
 */
@SpringBootTest
public class UserDiffDatasource {

    @Resource
    private W2_BumonMapper w2BumonMapper;

    @Resource
    private W3_BumonESService w3BumonESService;


    @Test
    @DS("wincare2")
    void find2(){
        List<W2_Bumon> w2BumonList = w2BumonMapper.getById(3);
        System.out.println("wincare2 查询到的数据为：" + w2BumonList);
    }

    @Test
    void find3(){
        List<W3_BumonRS> byId = w3BumonESService.getByid();
        System.out.println("wincare3 查询到的数据为：" + byId);
    }

}

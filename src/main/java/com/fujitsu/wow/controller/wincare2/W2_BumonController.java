package com.fujitsu.wow.controller.wincare2;


import com.fujitsu.wow.pojo.wincare2.W2_Bumon;
import com.fujitsu.wow.respone.Result;
import com.fujitsu.wow.service.wincare2.W2_BumonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Hzh
 * @since 2022-07-05
 */

@Slf4j
@RestController
@RequestMapping("/bumon")
public class W2_BumonController {

    @Resource
    private W2_BumonService bumonService;

    @GetMapping("/W2/getAll")
    public Result getAllChinacity() {
            List<W2_Bumon> bumonist = bumonService.getByid();
            return Result.SUCCESS("查询成功",bumonist);
    }







}


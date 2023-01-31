package com.fujitsu.wow.controller.wincare3;


import com.fujitsu.wow.pojo.wincare3.W3_BumonRS;
import com.fujitsu.wow.respone.Result;
import com.fujitsu.wow.service.wincare3.W3_BumonESService;
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
public class W3_BumonESController {

    @Resource
    private W3_BumonESService bumonService;


    @GetMapping("/W3/getAll")
    public Result getAllChinacity() {
            List<W3_BumonRS> bumonist = bumonService.getByid();
            return Result.SUCCESS("查询成功",bumonist);
    }







}


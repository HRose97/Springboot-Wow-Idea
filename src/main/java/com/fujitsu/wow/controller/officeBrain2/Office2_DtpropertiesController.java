package com.fujitsu.wow.controller.officeBrain2;

import com.fujitsu.wow.pojo.officeBrain2.Office2_Dtproperties;
import com.fujitsu.wow.respone.Result;
import com.fujitsu.wow.service.officeBrain2.Office2_DtpropertiesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/office2")
public class Office2_DtpropertiesController {


    @Resource
    Office2_DtpropertiesService office2DtpropertiesService;
    @GetMapping("/getAllTest")
    public Result insert(){
        List<Office2_Dtproperties> list = office2DtpropertiesService.getAll();
        return Result.SUCCESS("查询成功",list);


    }

}

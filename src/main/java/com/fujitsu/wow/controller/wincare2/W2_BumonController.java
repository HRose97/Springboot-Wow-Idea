package com.fujitsu.wow.controller.wincare2;


import com.fujitsu.wow.pojo.wincare2.W2_Bumon;
import com.fujitsu.wow.respone.Result;
import com.fujitsu.wow.service.wincare2.W2_BumonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
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

    /**
     * @Description getALL
     * @Param
     * @Return
     */
    @GetMapping("/W2/getAll")
    public Result getAllbumonist() {
            List<W2_Bumon> bumonist = bumonService.getAll();
            return Result.SUCCESS("查询成功",bumonist);
    }

    /**
     * @Description insert
     * @Param
     * @Return
     */
    @PostMapping("/bumonInsert")
    public Result bumonInsert(@RequestBody W2_Bumon w2Bumon){
        try {
            if (w2Bumon != null){
                w2Bumon.setDay(new Date());
                int row = bumonService.bumonInsert(w2Bumon);
                if (row == 1){
                    return Result.SUCCESS("bumonInsert success",row);
                }else {
                    log.error("bumonInsert fail");
                    return Result.FAILED("bumonInsert fail");
                }
            }else {
                log.error("params is null");
                return Result.FAILED("params is null");
            }
        }catch (Exception e){
            log.error("bumonInsert fail");
            throw new RuntimeException("bumonInsert fail",e);
        }
    }

    /**
     * @Description delete
     * @Param
     * @Return
     */
    @PostMapping("/bumonDeleteByid")
    public Result bumonDelete(@RequestBody  W2_Bumon w2Bumon){
        try {
            if (!w2Bumon.getId().equals("")){
                int isexit = bumonService.deleteById(w2Bumon.getId());
                if (isexit == 1){
                    return Result.SUCCESS("bumonDelete success",isexit);
                }else {
                    log.error("bumonDelete fail");
                    return Result.FAILED("bumonDelete fail");
                }
            }else {
                log.error("id is null");
                return Result.FAILED("params is null");
            }
        }catch (Exception e){
            log.error("bumonDelete fail");
            throw new RuntimeException("bumonDelete fail",e);
        }
    }


    /**
     * @Description update
     * @Param
     * @Return
     */
    @PostMapping("/bumonUpdate")
    public Result bumonUpdateById(@RequestBody W2_Bumon w2Bumon){
        try {
            if (w2Bumon != null && !w2Bumon.getId().equals("")){
                W2_Bumon isexit = bumonService.getByid(w2Bumon.getId());
                if (isexit != null){
                    w2Bumon.setDay(new Date());
                    int row = bumonService.bumonUpdateById(w2Bumon);
                    if (row == 1){
                        return Result.SUCCESS("bumonUpdateById success",row);
                    }else {
                        log.error("bumonUpdateById fail");
                        return Result.FAILED("bumonUpdateById fail");
                    }
                }else {
                    log.error("bumonUpdateById fail");
                    return Result.FAILED("id not null");
                }
            }else {
                log.error("params is null");
                return Result.FAILED("params is null");
            }
        }catch (Exception e){
            log.error("bumonUpdateById fail");
            throw new RuntimeException("bumonUpdateById fail",e);
        }
    }

    /**
     * @Description getBumonById
     * @Param 
     * @Return 
     */
    @PostMapping("getBumonById")
    public Result getBumonById(@RequestBody W2_Bumon w2Bumon){
        try {
            if (w2Bumon == null && w2Bumon.getId().equals("")){
                log.error("getBumonById params is null");
                return Result.FAILED("getBumonById params is null");
            }else {
                W2_Bumon byid = bumonService.getByid(w2Bumon.getId());
                return Result.SUCCESS("getBumonById succeess",byid);
            }
        }catch (Exception e){
            log.error("getBumonById error");
            throw new RuntimeException("getBumonById error",e);
        }

    }
    




}


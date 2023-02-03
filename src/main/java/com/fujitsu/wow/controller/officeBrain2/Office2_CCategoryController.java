package com.fujitsu.wow.controller.officeBrain2;

import com.fujitsu.wow.pojo.officeBrain2.Office2_CCategory;
import com.fujitsu.wow.respone.Result;
import com.fujitsu.wow.service.officeBrain2.Office2_CCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/office2")
public class Office2_CCategoryController {

    @Resource
    public Office2_CCategoryService office2CCategoryService;

    /**
     * @Description getAll
     * @Param null
     * @Return Result
     */
    @GetMapping("/getAll")
    public Result getAll(){
        try {
            List<Office2_CCategory> office2CCategoryList = office2CCategoryService.getAll();
            return Result.SUCCESS("查询成功",office2CCategoryList);
        }catch (Exception e){
            log.error("getAll is error");
            throw new RuntimeException("getAll is error",e);
        }

    }

    /**
     * @Description insert
     * @Param Office2_CCategory对象
     * @Return Result
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody Office2_CCategory office2CCategory){
        try {
            if (office2CCategory != null){
                Office2_CCategory findByCategory_CD = office2CCategoryService.getBycategoryCD(office2CCategory.getCategoryCD());
                if (findByCategory_CD != null){
                    return Result.FAILED("categoryCD already exists");
                }else {
                    int row = office2CCategoryService.insert(office2CCategory);
                    if (row == 1) {
                        return Result.SUCCESS("insert success", row);
                    } else {
                        return Result.FAILED("insert Fail");
                    }
                }
            }else {
                log.error("params is null");
                return Result.FAILED("params is null");
            }
        }catch (Exception e) {
            log.error("insert error");
            throw new RuntimeException("insert error!",e);
        }
    }

    /**
     * @Description update
     * @Param
     * @Return
     */
    @PostMapping("/update")
    public Result update(@RequestBody Office2_CCategory office2CCategory){
        try {
            if (office2CCategory != null){
                Office2_CCategory bycategoryCD = office2CCategoryService.getBycategoryCD(office2CCategory.getCategoryCD());
                if (bycategoryCD != null){
                  int row =   office2CCategoryService.updateBycategoryCD(office2CCategory);
                  if (row == 1){
                      return Result.SUCCESS("update Success",row);
                  }else {
                      log.error("update error");
                      return Result.FAILED("update Fail");
                  }
                }else {
                    log.error("update error");
                    return Result.FAILED("getBycategoryCD is null");
                }
            }else {
                log.error("update error");
                return Result.FAILED(" params is null");
            }
        }catch (Exception e){
            log.error("update error");
            throw new RuntimeException("update error",e);
        }
    }
    
    /**
     * @Description delete
     * @Param 
     * @Return 
     */
    @PostMapping("/delete")
    public Result delete(@RequestBody  Office2_CCategory categoryCD){
        try {
            if (categoryCD == null ){
                log.error("update error");
                return Result.FAILED("params is null");
            }else {
                int row = office2CCategoryService.deleteByCategoryCD(categoryCD.getCategoryCD());
                if (row == 1){
                    return Result.SUCCESS("delete success",row);
                }else {
                    log.error("delete fail");
                    return Result.FAILED("delete fail");
                }
            }
        }catch (Exception e){
            log.error("delete error");
            throw new RuntimeException("delete error",e);
        }
    }

    /**
     * @Description getOffice2ByCategoryCD
     * @Param
     * @Return
     */
    @PostMapping("/getOffice2ByCategoryCD")
    public Result getOffice2ByCategoryCD(@RequestBody Office2_CCategory office2CCategory){
        try {
            if (office2CCategory.getCategoryCD().equals("")){
                log.error("params is null");
                return Result.FAILED("params is null");
            }else {
                Office2_CCategory bycategoryCD = office2CCategoryService.getBycategoryCD(office2CCategory.getCategoryCD());
                return Result.SUCCESS("getOffice2ById success",bycategoryCD);
            }
        }catch (Exception e){
            log.error("getOffice2ById error");
            throw new RuntimeException("getOffice2ById errror" ,e );
        }
    }




}

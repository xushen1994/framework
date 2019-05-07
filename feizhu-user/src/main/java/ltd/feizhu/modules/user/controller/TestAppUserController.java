package ltd.feizhu.modules.user.controller;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import ltd.feizhu.modules.api.user.UserFeignService;
import ltd.feizhu.modules.user.service.SysUserService;
import ltd.feizhu.modules.user.service.SysUserTokenService;
import ltd.feizhu.modules.common.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author:xu shen
 * Description:
 * @Date:Created in 14:07 2019/3/27
 * @Modified By:
 */
@RestController
@EnableDistributedTransaction
@RequestMapping("/sys/test")
public class TestAppUserController {

    private static final Logger logger = LoggerFactory.getLogger(TestAppUserController.class);

    @Autowired
    private UserFeignService userFeignService;
    @Autowired
    private SysUserTokenService sysUserTokenService;
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/info")
    public R info(@RequestBody Map<String, Object> params){
        logger.info("app---------获取参数信息={}",params);
        R r = userFeignService.info(params);
        return R.ok().put("user", r.get("user"));
    }

    @GetMapping("/info1")
    public R info1(@RequestBody Map<String, Object> params){
        logger.info("app---------获取参数信息={}",params);
        R r = userFeignService.info(params);
        return R.ok().put("user", r.get("user"));
    }

    @PostMapping("/user")
    public R user(@RequestBody Map<String, Object> params){
        logger.info("app---------获取参数信息={}",params);
        params.put("sex","16");
        return R.ok().put("user",params);
    }



    /**
     * @Author:xu shen
     * Description:测试分布式事务A
     * @Date:Created in 2019/4/8 9:17
     * @Modified By:
     */
    @PostMapping("/insertUserA")
    public R txLcnInsertUser(){
        return sysUserService.txLcnInsertUser();
    }


}

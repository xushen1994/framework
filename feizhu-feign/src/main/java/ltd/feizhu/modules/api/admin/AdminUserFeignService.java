package ltd.feizhu.modules.api.admin;

import ltd.feizhu.modules.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @Author:xu shen
 * Description:测试
 * @Date:Created in 15:35 2019/3/27
 * @Modified By:
 */
@FeignClient(value = "feizhu-admin", path = "/admin")
public interface AdminUserFeignService {

    /**
     * @Author:xu shen
     * Description:获取用户信息
     * @Date:Created in 2019/3/27 14:05
     * @Modified By:
     */
    @PostMapping("/sys/test/user")
    R user(@RequestBody Map<String, Object> params);

    /**
     * @Author:xu shen
     * Description:测试分布式事务
     * @Date:Created in 2019/4/8 9:31
     * @Modified By:
     */
    @PostMapping("/sys/test/insertUserB")
    R txLcnInsertUserToken();
}

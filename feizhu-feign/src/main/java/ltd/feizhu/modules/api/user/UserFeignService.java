package ltd.feizhu.modules.api.user;

import ltd.feizhu.modules.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @Author:xu shen
 * Description:测试
 * @Date:Created in 13:54 2019/3/27
 * @Modified By:
 */
@FeignClient(value = "feizhu-user", path = "/user")
public interface UserFeignService {


    /**
     * @Author:xu shen
     * Description:获取用户信息
     * @Date:Created in 2019/3/27 14:05
     * @Modified By:
     */
    @PostMapping("/sys/test/info")
    R info(@RequestBody Map<String, Object> params);


    /**
     * @Author:xu shen
     * Description:获取用户信息
     * @Date:Created in 2019/3/27 14:05
     * @Modified By:
     */
    @PostMapping("/sys/test/info1")
    R info1(@RequestBody Map<String, Object> params);


}

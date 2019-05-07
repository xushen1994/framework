package ltd.feizhu.modules.shiro.oauth2;

import ltd.feizhu.modules.pojo.user.entity.SysUserEntity;
import ltd.feizhu.modules.pojo.user.entity.SysUserTokenEntity;
import ltd.feizhu.modules.shiro.service.ShiroService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Set;

/**
 * @Author:xu shen
 * Description: 检查
 * 因为在使用分布式事务的时候，OAuth2Realm类里面使用注解注入类，分布式事务就会失效。
 * 所以多写了这个类
 * @Date:Created in 13:50 2019/4/29
 * @Modified By:
 */
@Component
public class OAuth2Check {

    @Resource
    public ShiroService initService;

    public static ShiroService shiroService;

    @PostConstruct
    public void init() {
        shiroService = this.initService;
    }


    public static Set<String> getUserPermissions(Long userId){
        return shiroService.getUserPermissions(userId);
    }


    public static SysUserTokenEntity queryByToken(String accessToken){ return shiroService.queryByToken(accessToken); }


    public static SysUserEntity queryUser(Long userId){
        return shiroService.queryUser(userId);
    }




}

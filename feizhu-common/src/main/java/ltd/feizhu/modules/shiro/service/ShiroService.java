

package ltd.feizhu.modules.shiro.service;
import ltd.feizhu.modules.pojo.user.entity.SysUserEntity;
import ltd.feizhu.modules.pojo.user.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 *
 * @author Mark xushen
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}

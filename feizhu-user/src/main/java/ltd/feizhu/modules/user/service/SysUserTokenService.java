

package ltd.feizhu.modules.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ltd.feizhu.modules.common.utils.R;
import ltd.feizhu.modules.pojo.user.entity.SysUserTokenEntity;

/**
 * 用户Token
 *
 * @author Mark xushen
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

	/**
	 * @Author:xu shen
	 * Description:测试分布式事务
	 * @Date:Created in 2019/4/8 9:28
	 * @Modified By:
	 */
	R txLcnInsertUserToken();

}

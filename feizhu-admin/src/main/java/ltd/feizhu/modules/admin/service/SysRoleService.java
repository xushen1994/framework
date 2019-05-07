

package ltd.feizhu.modules.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ltd.feizhu.modules.common.utils.PageUtils;
import ltd.feizhu.modules.pojo.user.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;


/**
 * 角色
 *
 * @author Mark xushen
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void saveRole(SysRoleEntity role);

	void update(SysRoleEntity role);

	void deleteBatch(Long[] roleIds);

	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}

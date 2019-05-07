

package ltd.feizhu.modules.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ltd.feizhu.modules.pojo.user.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 系统用户
 *
 * @author Mark xushen
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
	
	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	List<String> queryAllPerms(Long userId);
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Long userId);
	
	/**
	 * 根据用户名，查询系统用户
	 */
	SysUserEntity queryByUserName(String username);

	@Select("select * from sys_user")
	List<SysUserEntity> getAccountList();

}

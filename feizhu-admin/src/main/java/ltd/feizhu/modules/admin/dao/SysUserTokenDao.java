

package ltd.feizhu.modules.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ltd.feizhu.modules.pojo.user.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 * @author Mark xushen
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}

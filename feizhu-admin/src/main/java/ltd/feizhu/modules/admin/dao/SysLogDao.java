

package ltd.feizhu.modules.admin.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ltd.feizhu.modules.pojo.user.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author Mark xushen
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}

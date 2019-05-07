

package ltd.feizhu.modules.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ltd.feizhu.modules.pojo.user.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author Mark xushen
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}

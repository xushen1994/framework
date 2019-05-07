

package ltd.feizhu.modules.user.service;


import com.baomidou.mybatisplus.extension.service.IService;
import ltd.feizhu.modules.common.utils.PageUtils;
import ltd.feizhu.modules.pojo.user.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mark xushen
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}

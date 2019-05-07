

package ltd.feizhu.modules.pojo.user.form;

import lombok.Data;

/**
 * 登录表单
 *
 * @author Mark xushen
 */
@Data
public class SysLoginForm {
    private String username;
    private String password;
    private String captcha;
    private String uuid;


}

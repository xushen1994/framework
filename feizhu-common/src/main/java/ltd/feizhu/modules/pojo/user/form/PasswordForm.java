

package ltd.feizhu.modules.pojo.user.form;

import lombok.Data;

/**
 * 密码表单
 *
 * @author Mark xushen
 */
@Data
public class PasswordForm {
    /**
     * 原密码
     */
    private String password;
    /**
     * 新密码
     */
    private String newPassword;

}

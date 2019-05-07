

package ltd.feizhu.modules.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author Mark xushen
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

	String value() default "";
}

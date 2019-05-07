

package ltd.feizhu.modules.common.utils;

/**
 * Redis所有Keys
 *
 * @author Mark xushen
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "shop:config:" + key;
    }
}

package ltd.feizhu.modules.common.logback;


import ch.qos.logback.classic.PatternLayout;

/**
 * 
 * @Project : linkedhu-core
 * @Program Name : com.linkedhu.common.logback.BHPatternLayout.java
 * @Description : logback属性添加
 * @Author : chutong
 * @Creation Date : 2018年7月3日 下午7:02:07
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      chutong 2018年7月3日 create
 */
public class BHPatternLayout extends PatternLayout {

    static {
        defaultConverterMap.put("ip", IPConverter.class.getName());
    }
}

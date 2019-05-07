package ltd.feizhu.modules.common.logback;


import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * @Project : linkedhu-core
 * @Program Name : com.linkedhu.common.logback.IPConverter.java
 * @Description : 获取IP
 * @Author : chutong
 * @Creation Date : 2018年7月6日 下午5:26:01
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      chutong 2018年7月6日 create
 */
public class IPConverter extends ClassicConverter {
    
    @Override
    public String convert(ILoggingEvent arg0) {
        String ip = "";
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
            ip = addr.getHostAddress();// 获得本机IP
        } catch (UnknownHostException e) {
            e.printStackTrace();
            ip = "";
        }
        return ip;
    }

}

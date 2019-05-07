package ltd.feizhu.modules.config.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    /**
     * @return : Logger.Level
     * @Description : 日志级别
     * @Creation Date : 2019/3/27 14:05
     * @Author : xushen
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /**
     * 
     * @Description : 创建Feign请求拦截器，在发送请求前设置认证的token,各个微服务将token设置到环境变量中来达到通用
     * @return : FeignBasicAuthRequestInterceptor
     * @Creation Date : 2019/3/27 14:05
     * @Author : xushen
     */
    @Bean
    public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new FeignBasicAuthRequestInterceptor();
    }

}


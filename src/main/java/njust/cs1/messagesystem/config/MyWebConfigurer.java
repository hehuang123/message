package njust.cs1.messagesystem.config;

import njust.cs1.messagesystem.interceptor.LoginInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.*;


/**
 * 拦截器配置类
 */
@SpringBootConfiguration
public class MyWebConfigurer implements WebMvcConfigurer {

    @Bean
    public LoginInterceptor getLoginIntercepter() {
        return new LoginInterceptor();
    }

    /**
     * 拦截除home.html的所有路径
     * @param registry 映射截取程序列表
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(getLoginIntercepter()).addPathPatterns("/**").excludePathPatterns("/home.html");
    }
}

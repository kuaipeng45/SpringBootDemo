package com.example.config.base;

import com.example.config.interceptor.LogInterceptor;
import com.example.config.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**


/**
 * @ClassName: WebConfiguration
 * @Description: TODO
 * @author kuaipeng
 * @date 2019/5/1014:54
 * @Version 1.0
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /**
     * 日志拦截器
     */
    @Autowired
    private LogInterceptor logInterceptor;

    /**
     * 登录拦截器
     */
    @Autowired
    private LoginInterceptor loginInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor).addPathPatterns("/**");
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/login","/error");

    }

}

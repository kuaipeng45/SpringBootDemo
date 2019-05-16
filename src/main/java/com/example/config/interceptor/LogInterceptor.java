package com.example.config.interceptor; /**
 * @Title: LoginInterceptor
 * @ProjectName SpringBootDemo
 * @Description: TODO
 * @author Administrator
 * @date 2019/5/1014:56
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: LogInterceptor
 * @Description: TODO
 * @author kuaipeng
 * @date 2019/5/1014:56
 * @Version 1.0
 */
@Component
public class LogInterceptor implements HandlerInterceptor {

    static Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        logger.info("请求路径：{}", request.getRequestURI());
        return true;
    }
}

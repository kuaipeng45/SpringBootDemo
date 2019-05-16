package com.example.config.interceptor; /**
 * @Title: LoginInterceptor
 * @ProjectName SpringBootDemo
 * @Description: TODO
 * @author Administrator
 * @date 2019/5/1015:22
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: LoginInterceptor
 * @Description: TODO
 * @author kuaipeng
 * @date 2019/5/1015:22
 * @Version 1.0
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    static Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{

        // 检查每个到来的请求对应的session域中是否有登录标识
        Object loginName = request.getSession().getAttribute("loginUser");
        if (null == loginName || !(loginName instanceof String)) {
            // 未登录，重定向到登录页
            response.sendRedirect("/login");
            logger.info("登录拦截：{}", request.getRequestURI());
            return false;
        }
        String userName = (String) loginName;
        System.out.println("当前用户已登录，登录的用户名为： " + userName);
        return true;

    }
}

package com.example.config.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: DemoErrorController
 * @Description: TODO
 * @author kuaipeng
 * @date 2019/5/1016:24
 * @Version 1.0
 */
@Controller
public class DemoErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request){
        //获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if(statusCode == 401){
            return "/error";
        }else if(statusCode == 404){
            return "/error";
        }else if(statusCode == 403){
            return "/error";
        }else{
            return "/error";
        }

    }
    @Override
    public String getErrorPath() {
        return "/error";
    }
}

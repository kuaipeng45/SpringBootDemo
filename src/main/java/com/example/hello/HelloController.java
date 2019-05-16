package com.example.hello; /**
 * @Title: HelloController
 * @ProjectName SpringBootDemo
 * @Description: TODO
 * @author Administrator
 * @date 2019/5/1010:29
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @author kuaipeng
 * @date 2019/5/1010:29
 * @Version 1.0
 */
@Controller
public class HelloController {

    @ResponseBody
    @GetMapping(value = "/hello")
    public String helloSpringBoot(){
        return "Hello SpringBoot!";
    }

    @GetMapping("/item")
    public String item(Model model){
        model.addAttribute("itemArr", new String[]{"iphone7测试ha","华为手机","小米手机"});
        return "data/item";
    }

    @GetMapping("/login")
    public String login(){ return "login"; }

    /*@GetMapping("/error")
    public String error(){ return "error"; }*/

}

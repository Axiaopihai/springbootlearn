package com.myself.springbootlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * 2020/3/28
 */
@Controller
public class Login {
    @GetMapping("/hello")
    public String login(Model model){
        Logger logger = LoggerFactory.getLogger(getClass());
        //业务操作获取属性值attributeValue
        //域中添加属性
        //model.addAttribute("emp",attributeValue);
        //返回值由模板引擎进行解析，前缀classpath:templates,后最.html，在templates中寻找
        //redirect:重定向 forward:转发
        throw new RuntimeException("出错了");
//        return "index";
    }
}

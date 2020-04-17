package com.myself.springbootlearn.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author zxq
 * 2020/3/30
 */
@ControllerAdvice
public class ExceptionsH {

    @ExceptionHandler(Exception.class)
    public String exceptionH(Exception e, HttpServletRequest request){
        HashMap<String, Object> map = new HashMap<>();
        request.setAttribute("javax.com.myself.springbootlearn.servlet.error.status_code",500);
        map.put("code",400);
        map.put("message",e.getMessage());
        return "forward:/error";
    }
}

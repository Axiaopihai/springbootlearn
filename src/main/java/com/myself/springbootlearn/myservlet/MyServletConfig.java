package com.myself.springbootlearn.myservlet;

import com.myself.springbootlearn.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

/**
 * @author zxq
 * 2020/3/30
 */
@Configuration
public class MyServletConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean<Servlet> registrationBean = new ServletRegistrationBean<>(
                new MyServlet(),"/myServlet"
        );
        return registrationBean;
    }


}

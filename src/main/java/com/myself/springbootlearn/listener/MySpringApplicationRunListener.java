package com.myself.springbootlearn.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zxq
 * 2020/4/2
 */
public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    public MySpringApplicationRunListener(SpringApplication application, String[] args){}

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("启动SpringApplicationRunListener");
    }
}

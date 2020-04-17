package com.myself.springbootlearn.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zxq
 * 2020/4/2
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;
    @Bean
    public Hello hello(){
        Hello hello = new Hello();
        hello.setHelloProperties(helloProperties);
        return hello;
    }
}

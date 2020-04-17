package com.myself.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = "classpath:beans.xml")//location的值可配置多个
@SpringBootApplication
public class SpringbootlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootlearnApplication.class, args);
    }

}

package com.myself.springbootlearn.conf;

import com.myself.springbootlearn.entity.Person;
//import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zxq
 * 2020/3/25
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Bean
    public Person getPerson(){
        return new Person();
    }

//    @Bean
//    public ConfigurationCustomizer configurationCustomizer(){
//        return new ConfigurationCustomizer() {
//            @Override
//            public void customize(org.apache.ibatis.session.Configuration configuration) {
//                configuration.setMapUnderscoreToCamelCase(true);
//            }
//        };
//    }

}

package com.myself.springbootlearn.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @@ConfigurationProperties:告诉springboot将类中的所有属性和配置文件中相关
 * 的配置进行绑定
 * prefix = "person"：指定配置文件中哪个路径下的属性，指定映射关系
 * @Component 导入到spring boot容器中，这样才能应用@ConfigurationProperties
 * 提供的功能
 */
@Component
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = "classpath:myProperties.properties")
public class Person {
//    @Value("${person.last-name}")//普通取值
    private String lastName;
//    @Value("#{2*9}")//进行计算SpEL语法
    private Integer age;
//    @Value("true")//设置默认值
    private boolean boo;

    private Map<String,Object> maps;
    private List<Object> list;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boo=" + boo +
                ", maps=" + maps +
                ", list=" + list +
                '}';
    }
}

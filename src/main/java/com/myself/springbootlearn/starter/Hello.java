package com.myself.springbootlearn.starter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zxq
 * 2020/4/2
 */
public class Hello {


    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public void sayHello(String name){
        System.out.println(helloProperties.getPrefix()+name+helloProperties.getSuffix());
    }
}

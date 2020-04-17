package com.myself.springbootlearn.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zxq
 * 2020/4/2
 */
@ConfigurationProperties(prefix = "myself.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}

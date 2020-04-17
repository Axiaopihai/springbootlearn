package com.myself.springbootlearn.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author zxq
 * 2020/4/1
 */
@Entity //告诉jpa这是一个实体类
@Table(name = "account2") //指定和哪个数据表对应，如果省略默认表名为该类名小写
public class Account {
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;
    @Column(name = "user_name")
    private String userName;
    @Column (name = "time")//省略name默认列名为属性名
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", date=" + date +
                '}';
    }
}

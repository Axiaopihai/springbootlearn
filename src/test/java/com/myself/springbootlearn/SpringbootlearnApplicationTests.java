package com.myself.springbootlearn;

import com.myself.springbootlearn.entity.Account;
import com.myself.springbootlearn.entity.Person;
import com.myself.springbootlearn.mapper.JpaMapper;
import com.myself.springbootlearn.mapper.MyBatisMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootlearnApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    Person person;
//    @Autowired
//    MyBatisMapper myBatisMapper;
    @Autowired
    JpaMapper jpaMapper;
    @Test
    void contextLoads() throws SQLException {
        System.out.println("类型："+dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("连接"+connection);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        //jdbcTemplate.queryForList("select * from r_job");
    }

//    @Test
//    void testMapper(){
//        Account account = new Account();
//        account.setUserName("jeck6");
//        myBatisMapper.insertAccount(account);
//        System.out.println(account);
//    }
//
//    @Test
//    void queryMapper(){
//        Account account = myBatisMapper.queryAccountById(5);
//        System.out.println(account);
//    }

    @Test
    void jpaQueryMapper(){
        Optional<Account> account = jpaMapper.findById(5);
        System.out.println(account);
    }

}

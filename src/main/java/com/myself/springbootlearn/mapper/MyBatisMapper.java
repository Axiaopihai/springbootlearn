package com.myself.springbootlearn.mapper;

import com.myself.springbootlearn.entity.Account;
import com.myself.springbootlearn.entity.Person;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Options;
//import org.apache.ibatis.annotations.Select;

/**
 * @author zxq
 * 2020/4/1
 */
//@Mapper
public interface MyBatisMapper {

//    @Select("Select * from account2 where id=#{id}")
    public Account queryAccountById(Integer id);

//    @Options(useGeneratedKeys = true,keyProperty = "id")
//    @Insert("insert into account2(user_name) values (#{userName})")
    public void insertAccount(Account account);

}

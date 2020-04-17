package com.myself.springbootlearn.mapper;

import com.myself.springbootlearn.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zxq
 * 2020/4/2
 */
public interface JpaMapper extends JpaRepository<Account,Integer> {
}

package com.lgguan.springcloud.myservicemysql.dao;

import com.lgguan.springcloud.myservicemysql.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}

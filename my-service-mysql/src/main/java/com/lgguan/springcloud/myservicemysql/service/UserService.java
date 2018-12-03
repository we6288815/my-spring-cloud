package com.lgguan.springcloud.myservicemysql.service;

import com.lgguan.springcloud.myservicemysql.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity findByUsername(String username);
    List<UserEntity> findAll();
}

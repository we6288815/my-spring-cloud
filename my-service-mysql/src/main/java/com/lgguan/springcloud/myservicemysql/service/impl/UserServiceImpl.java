package com.lgguan.springcloud.myservicemysql.service.impl;

import com.lgguan.springcloud.myservicemysql.dao.UserDao;
import com.lgguan.springcloud.myservicemysql.entity.UserEntity;
import com.lgguan.springcloud.myservicemysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserEntity findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }
}

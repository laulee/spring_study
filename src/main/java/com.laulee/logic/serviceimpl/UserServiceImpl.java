package com.laulee.logic.serviceimpl;

import com.laulee.bean.User;
import com.laulee.logic.dao.UserDao;
import com.laulee.logic.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void addUser(User user){
        System.out.println("service保存user");
        userDao.addUser(user);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
package com.laulee.logic.daoimpl;

import com.laulee.bean.User;
import com.laulee.logic.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public void addUser(User user) {

        System.out.println("数据库保存user");
    }
}

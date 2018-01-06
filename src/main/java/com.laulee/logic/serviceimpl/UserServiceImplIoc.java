package com.laulee.logic.serviceimpl;

import com.laulee.bean.User;
import com.laulee.logic.dao.UserDao;
import com.laulee.logic.daoimpl.UserDaoImpl;
import com.laulee.logic.service.UserService;

public class UserServiceImplIoc implements UserService {

    private UserDao userDao;

    /**
//     * 1.setter方法注入，已经实现
//     * @param userDao
//     */
//    public void setUserDao(UserDao userDao){
//        this.userDao = userDao;
//    }


    /**
     * 2.构造函数注入
     * @param userDao
     */
    public UserServiceImplIoc(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 3.方法注入，添加一个注入对象示例返回的方法
     * @return
     */
    public UserDaoImpl getUserDao(){
        return null;
    }

    public void init(){
        System.out.println("UserServiceImplIoc初始化了");
    }

    public void addUser(User user) {
        //1,2调用这种方式
        userDao.addUser(user);

        //3调用此方式
        getUserDao().addUser(user);
    }
}

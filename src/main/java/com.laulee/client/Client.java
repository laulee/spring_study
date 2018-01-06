package com.laulee.client;

import com.laulee.bean.User;
import com.laulee.logic.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String [] args){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) beanFactory.getBean("userServiceIoc");
        User user = new User();
        userService.addUser(user);
    }
}

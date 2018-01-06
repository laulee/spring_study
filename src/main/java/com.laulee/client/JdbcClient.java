package com.laulee.client;

import com.laulee.bean.User;
import com.laulee.logic.service.JdbcService;
import com.laulee.logic.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcClient {

    public static void main(String [] args){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        JdbcService jdbcService = (JdbcService) beanFactory.getBean("jdbcService");
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("123456");
        jdbcService.addUser(user);
    }
}

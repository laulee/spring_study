package com.laulee.logic.serviceimpl;

import com.laulee.bean.User;
import com.laulee.logic.service.JdbcService;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcServiceImpl implements JdbcService {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addUser(User user) {
        String sql = "insert into spring_user(name,password) values("+"'"+user.getName()+"'"+","+"'"+user.getPassword()+"'"+")";
        int result = jdbcTemplate.update(sql);//插入数据库后修改行数 为1正确
        if(result==1){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
    }
}

package com.test.jspweb.sevice.impl;

import com.test.jspweb.bean.User;
import com.test.jspweb.dao.UserDao;
import com.test.jspweb.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    @Override
    public boolean isValidate(String usn, String pwd) {
        boolean result = false;
        //因为是通过名字获取user的信息,名字输入错误,user信息获取不到,list集合为空
        //所以不需要再次判断用户名
        List<User> users = userDao.findUserByUsn(usn);
        //有可能通过名字找到多个用户，没法作比较，就会报异常
        //users.size()限定list集合中的数量为1条
        if(users != null && users.size() == 1
           && pwd != null && pwd.equals(users.get(0).getPwd()))
            result = true;
        return result;
    }

}

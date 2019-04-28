package com.test.jspweb.sevice;

import com.test.jspweb.bean.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();

    boolean isValidate(String usn,String pwd);
}

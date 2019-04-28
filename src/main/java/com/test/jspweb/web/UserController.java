package com.test.jspweb.web;

import com.test.jspweb.bean.User;
import com.test.jspweb.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*@RequestMapping("/getAllUser")
    public String getAllUser(Map<String,Object> model){
        List<User> users = userService.findAllUser();
        model.put("users",users);
        return "allUsers";
    }*/

    //想要返回JSON字串,@ResponseBody会把返回的结果封装成JSON字串
    @ResponseBody
    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.findAllUser();
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }

    //jsp页面的input中name属性的值和User类里属性的值必须一致（约定）
    //一致后相当于已经建立了映射，完成了绑定，可直接对User操作
    //当用户输入信息时，可以通过get方法获取属性，此时获取到的是input中name属性的值
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user){
        boolean result = userService.isValidate(user.getUsn(),user.getPwd());
        if(result)
            return "welcome";
        else
            return "login";
    }
}
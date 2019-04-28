package com.test.jspweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class WelcomeController {

    /*@GetMapping("/")
    public String welcome(Map<String,Object> model){
        model.put("time",new Date());
        model.put("message","Hello,World!");
        return "welcome";
    }*/

    @GetMapping("/")
    public ModelAndView welcome(){
        ModelAndView mv = new ModelAndView();
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("time",new Date());
        modelMap.put("message","Hello,World!!");
        mv.addAllObjects(modelMap);
        mv.setViewName("welcome");
        return mv;
    }
}

package com.test.jspweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.jspweb.dao")
public class JspwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JspwebApplication.class, args);
    }

}

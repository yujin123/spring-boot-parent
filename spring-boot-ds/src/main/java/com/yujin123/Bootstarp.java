package com.yujin123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ${DESCRIPTION}
 *
 * @author yujin
 * @email yujin7@staff.sina.com.cn
 * @create 2016-09-01 11:43
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.yujin123")
public class Bootstarp {

    public static void main(String[] args) {
        SpringApplication.run(Bootstarp.class, args);
    }
}

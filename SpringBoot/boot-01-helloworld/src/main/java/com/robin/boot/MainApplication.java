package com.robin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Author: Robin_Wujw
 * @Date: 2022-09-08 11:05
 * 主程序类
 * @SpringBootApplication告诉sp这是一个sp应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }

}

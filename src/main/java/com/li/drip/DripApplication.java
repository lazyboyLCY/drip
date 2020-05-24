package com.li.drip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@MapperScan("com.li.drip.dao")
public class DripApplication {

    public static void main(String[] args) {
        SpringApplication.run(DripApplication.class, args);
    }

}

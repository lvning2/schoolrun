package com.schoolrun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@MapperScan("com.schoolrun.mapper")
public class SchoolrunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolrunApplication.class, args);
    }

}

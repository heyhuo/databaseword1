package com.zcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DatabasewordApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabasewordApplication.class, args);
    }

}

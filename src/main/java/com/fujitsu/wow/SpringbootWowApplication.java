package com.fujitsu.wow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//移除默认数据库配置类(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootWowApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWowApplication.class, args);
    }

}

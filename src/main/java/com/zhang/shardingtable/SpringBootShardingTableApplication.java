package com.zhang.shardingtable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhang.shardingtable.mapper")
@SpringBootApplication
public class SpringBootShardingTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootShardingTableApplication.class, args);
    }

}

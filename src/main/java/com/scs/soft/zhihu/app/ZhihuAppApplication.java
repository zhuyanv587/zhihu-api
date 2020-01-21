package com.scs.soft.zhihu.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhuyan
 * @description SwaggerConfig
 * @create 2020/1/16
 */
@SpringBootApplication
@MapperScan("com.scs.soft.zhihu.app.mapper")
public class ZhihuAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuAppApplication.class, args);
    }

}

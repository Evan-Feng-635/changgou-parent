package com.changgou;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class CommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class);
        log.info("服务启动成功");
    }
}

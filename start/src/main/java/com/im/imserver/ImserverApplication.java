package com.im.imserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.im.imserver", "com.alibaba.cola" })
@MapperScan("com.im.imserver.gatewayimpl.database")
public class ImserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImserverApplication.class, args);
    }

}

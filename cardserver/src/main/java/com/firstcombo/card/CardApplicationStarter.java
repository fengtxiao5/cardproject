package com.firstcombo.card;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName CardApplicationStarter
 * @Description
 * @Author ftx
 * @Date 2021/8/25 18:40
 * @Version 1.0
 **/
@ImportResource("classpath:applicationContext.xml")
@SpringBootApplication
@MapperScan("com.firstcombo.card.server.repo.mapper")
public class CardApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(CardApplicationStarter.class);
    }
}

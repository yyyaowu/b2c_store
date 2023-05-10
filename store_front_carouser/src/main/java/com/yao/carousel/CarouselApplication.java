package com.yao.carousel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@MapperScan(basePackages = "com.yao.carousel.mapper")
@EnableCaching
public class CarouselApplication {


    public static void main(String[] args) {
        SpringApplication.run(CarouselApplication.class,args);
    }

}

package com.yao;

import com.yao.clients.CategoryClient;
import com.yao.clients.OrderClient;
import com.yao.clients.ProductClient;
import com.yao.clients.UserClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.yao.mapper")
@SpringBootApplication
@EnableFeignClients(clients = {UserClient.class, CategoryClient.class, ProductClient.class, OrderClient.class})  //添加客户端引用
@EnableCaching //开启缓存支持
public class AdminApplication  {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}

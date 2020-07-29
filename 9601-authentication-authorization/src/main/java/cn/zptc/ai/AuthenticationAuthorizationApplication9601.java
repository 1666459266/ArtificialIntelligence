package cn.zptc.ai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("cn.zptc.ai.dao")
@EnableDiscoveryClient
@EnableCaching//开启缓存注解
public class AuthenticationAuthorizationApplication9601 {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationAuthorizationApplication9601.class,args);
    }
}

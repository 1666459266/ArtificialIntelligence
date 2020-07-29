package cn.zptc.ai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//配置Seata 取消数据源的自动创建
@MapperScan("cn.zptc.ai.dao")
@EnableDiscoveryClient
@EnableFeignClients
@EnableTransactionManagement//开启事务注解
@EnableCaching//开启缓存注解
public class WebsiteProviderApplication8303 {
    public static void main(String[] args) {
        SpringApplication.run(WebsiteProviderApplication8303.class,args);
    }
}

package com.shuai.seckill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author yongshuai
 */
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class SeckillPolicyConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillPolicyConsumerApplication.class, args);
    }

}

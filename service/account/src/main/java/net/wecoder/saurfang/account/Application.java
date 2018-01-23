package net.wecoder.saurfang.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;

/**
 * @author liulm
 * @date 2018-01-18 14:35
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Application {

    public static void main(String[] args) {
        //EurekaClientConfigBean
        SpringApplication.run(Application.class,args);
    }
}

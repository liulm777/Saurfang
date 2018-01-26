package net.wecoder.saurfang.account;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${dynamic-info}")
    static String dynamicInfo;

    @Value("${server.port}")
    static String serverPort;

    public static void main(String[] args) {
        //EurekaClientConfigBean
        SpringApplication.run(Application.class,args);
        System.out.println(dynamicInfo);
        System.out.println(serverPort);
       /* while (true){
            System.out.println(dynamicInfo);
        }*/
    }


}


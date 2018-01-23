package net.wecoder.saurfang.account.user;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author liulm
 * @date 2018-01-18 14:42
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("/getUserInfo")
    public String getUserInfo(){
        System.out.println(Arrays.toString(discoveryClient.getServices().toArray()));
        return "tom";
    }
}

package net.wecoder.saurfang.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author liulm
 * @date 2018-01-18 14:15
 **/
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumerAccount")
    public String consumerAccount(){
        return restTemplate.getForEntity("http://account/user/getUserInfo",String.class).getBody();
    }
}

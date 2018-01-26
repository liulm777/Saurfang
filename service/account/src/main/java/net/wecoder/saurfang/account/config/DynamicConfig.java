package net.wecoder.saurfang.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.AbstractEnvironment;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author liulm
 * @date 2018-01-26 18:20
 **/
@Configuration
public class DynamicConfig {

    private static final  String DYNAMIC_CONFIG = "dynamic_config";

    @Resource
    private AbstractEnvironment environment;

    @PostConstruct
    public void init(){
        environment.getPropertySources().addFirst(new DynamicPropertySource(DYNAMIC_CONFIG));
    }

}

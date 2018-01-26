package net.wecoder.saurfang.account.config;

import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author liulm
 * @date 2018-01-26 18:07
 **/
public class DynamicPropertySource extends MapPropertySource {

    private static ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);

    private static Map map = new ConcurrentHashMap<String,Object>(64);

    static {
        scheduled.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                map = dynamicLoadMapInfo();
            }
        },1,10, TimeUnit.SECONDS);
    }

    @Override
    public Object getProperty(String name) {
       // System.out.println(name);
        return map.get(name);
    }

    private static Map<String,Object> dynamicLoadMapInfo(){
        return mockMapInfo();
    }

    private static Map<String,Object> mockMapInfo(){
        Map<String, Object> map = new HashMap<String, Object>();
        int randomData = new Random().nextInt();
        map.put("dynamicInfo", randomData);
        return map;
    }

    public DynamicPropertySource(String name) {
        super(name, map);
    }
}

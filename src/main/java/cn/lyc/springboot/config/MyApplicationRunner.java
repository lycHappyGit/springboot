package cn.lyc.springboot.config;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("这里可以在项目启动后 立即执行,参数为 : " + JSON.toJSON(args));
    }
}

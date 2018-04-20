package cn.lyc.springboot.config;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("这里可以在项目启动后 立即执行,参数为 : " + JSON.toJSON(args));
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("file/aa.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in,"utf-8"));
        String s;
        System.out.println("开始读取文件");
        while((s = bufferedReader.readLine()) != null){
            System.out.println(s);
        }
//        int len;
//        byte[] temp = new byte[1024];
//        while((len = in.read(temp)) != -1){
//            System.out.println(new String(temp, "utf-8"));
//        }
    }
}

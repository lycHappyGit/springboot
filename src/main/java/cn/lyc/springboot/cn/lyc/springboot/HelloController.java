package cn.lyc.springboot.cn.lyc.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @RequestMapping("/aa")
    public String aa(){
        return "hello world!";
    }
}

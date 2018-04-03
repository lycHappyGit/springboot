package cn.lyc.springboot.cn.lyc.springboot;

import cn.lyc.springboot.dao.UserMapper;
import cn.lyc.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserMapper um;

    @RequestMapping("/findAll")
    public User findAll(){

        User user = um.selectByPrimaryKey(1);
        return user;
    }

    @RequestMapping("/findById")
    public User findById(){

        User user = um.selectByPrimaryKey(1);
        return user;
    }

}

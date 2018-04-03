package cn.lyc.springboot;

import cn.lyc.springboot.dao.UserMapper;
import cn.lyc.springboot.entity.User;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

	@Autowired
	private UserMapper um;

	@Test
	public void contextLoads() {

		System.out.println("哈哈哈 project启动了************");
	}

	@Test
	public void test1() {

		User user = um.selectByPrimaryKey(1);
		System.out.println(JSON.toJSON(user));
	}


	public static void main(String[] args) {

		System.out.println(UUID.randomUUID().toString().replace("-", ""));
		System.out.println(UUID.randomUUID().toString().replace("-", ""));
	}

}

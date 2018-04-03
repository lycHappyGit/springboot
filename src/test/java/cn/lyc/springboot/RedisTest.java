package cn.lyc.springboot;

import cn.lyc.springboot.service.impl.RedisService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

	@Autowired
	private RedisService redis;

	@Test
	public void test(){

		Object name = redis.get("name");
		System.out.println(name);
	}

	@Test
	public void test2(){

		boolean flag = redis.set("name", "lyc");
		System.out.println(flag);
	}

	@Test
	public void test3(){

		System.out.println("开始存储hmset中的值");

		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name","zhangsan");
		map.put("age","18");
		map.put("sex","女");

		list.add(map);
		redis.lPush("persons",list);

		System.out.println("开始获取hmset中的值");

		List<Object> persons = redis.lRange("persons", 0, 0);
		for(Object o : persons){
			System.out.println(JSON.toJSON(o));
		}
	}

}

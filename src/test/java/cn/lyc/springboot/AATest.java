package cn.lyc.springboot;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;

public class AATest {

	@Test
	public void contextLoads() {

		System.out.println("哈哈哈 project启动了************");
	}

	@Test
	public void test1() throws FileNotFoundException {

		Map<String, String> map = new TreeMap<String, String>();
		map.put("SecretId","");
		map.put("Timestamp","");
		map.put("Nonce","");
		map.put("encryptCode","");
		map.put("zipCode","");
		map.put("Signature","");
		map.put("content","");

		for(String s : map.keySet()){
			System.out.println(s);
		}
	}
}

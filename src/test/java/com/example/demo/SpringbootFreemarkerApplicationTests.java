package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.CityService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootFreemarkerApplicationTests {

	@Autowired
	private CityService cityService;

	/**
	 * jdbcTemplate相关测试
	 */
	@Test
	public void test() {
		cityService.createCity(2L, "苏州", "而我在苏州");
	}

	@Test
	public void contextLoads() {

	}

}

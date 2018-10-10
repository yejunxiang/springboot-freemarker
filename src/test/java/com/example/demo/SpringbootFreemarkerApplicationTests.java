package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.CityService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootFreemarkerApplicationTests {

	@Autowired
	private CityService cityService;

	/**
	 * 数据源1的jdbcTemplate
	 */
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	private JdbcTemplate jdbcTemplate1;

	/**
	 * 数据源2的jdbcTemplate
	 */
	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	private JdbcTemplate jdbcTemplate2;

	/**
	 * jdbcTemplate相关测试
	 */
	@Test
	public void test() {
		cityService.createCity(2L, "苏州", "而我在苏州");
	}

	/**
	 * 数据源2的测试
	 */
	@Test
	public void test2() {
		jdbcTemplate2.update("insert into city(province_id, city_name, description) values (?, ?, ?)", 1L, "杭州",
				"muxinxin在杭州啊");
	}

	/**
	 * 数据源2的测试
	 */
	@Test
	public void test3() {
		jdbcTemplate1.update("insert into city(province_id, city_name, description) values (?, ?, ?)", 2L, "苏州",
				"我在苏州啊");
	}

	@Test
	public void contextLoads() {

	}

}

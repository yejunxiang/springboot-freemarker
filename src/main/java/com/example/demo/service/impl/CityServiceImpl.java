package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CityMapper;
import com.example.demo.domain.City;
import com.example.demo.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;

	// jdbcTemplate
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public City findById(Long id) {
		return cityMapper.selectByPrimaryKey(id);
	}

	@Override
	public void createCity(Long provinceId, String cityName, String description) {
		jdbcTemplate.update("insert into city(province_id, city_name, description) values (?, ?, ?)", provinceId,
				cityName, description);
	}
}

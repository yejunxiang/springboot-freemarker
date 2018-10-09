package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CityMapper;
import com.example.demo.domain.City;
import com.example.demo.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;

	public City findById(Long id) {
		return cityMapper.selectByPrimaryKey(id);
	}
}

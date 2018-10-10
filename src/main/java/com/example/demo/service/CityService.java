package com.example.demo.service;

import com.example.demo.domain.City;

public interface CityService {

	City findById(Long id);

	void createCity(Long provinceId, String cityName, String description);

}

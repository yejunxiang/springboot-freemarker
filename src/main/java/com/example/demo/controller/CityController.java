package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.City;
import com.example.demo.service.impl.CityServiceImpl;

/**
 * 
 * @author yejunxiang
 * @date 2018年10月9日
 */
@Controller
@RequestMapping("/api/city")
public class CityController {

	@Autowired
	private CityServiceImpl cityService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String findOne(Model model, @PathVariable("id") Long id) {
		City city = cityService.findById(id);
		model.addAttribute("city", city);
		return "views/singleCity";
	}

}

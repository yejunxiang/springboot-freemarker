package com.example.demo.aoptest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AopTestController {

	@RequestMapping("/sayHello")
	@ResponseBody
	public String sayHello(@RequestParam("name") String name) {
		return "Hello," + name;
	}

}

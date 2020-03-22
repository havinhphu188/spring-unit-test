package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.GreetingService;

@Controller
public class GreetingController {

	@Autowired
	private GreetingService service;


	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return service.greet();
	}

}
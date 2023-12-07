package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/view")
public class HelloWorldController {
	
	
	
	@GetMapping("helloworld")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("bsm")
	public String bsm() {
		return "Bsm da Generation";
	}
	
	@GetMapping("aprendizado")
	public String aprendizado() {
		return "Aprendizado";
	}
	

	
	
}

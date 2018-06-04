package com.kasthuri.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "hello from panda";
	}
	
	@RequestMapping("/panda")
	public String panda() {
		return "hello from karady";
	}
	
	

}

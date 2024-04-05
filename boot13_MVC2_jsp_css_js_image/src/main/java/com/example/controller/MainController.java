package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String main() {
		System.out.println("/ 주소 요청///////");
		System.out.println("/ jenkins에서 자동적인 배포함 ");
		System.out.println("/ jenkins aws 자동배포 적용 ");
		return "main";
	}
	@GetMapping("/loginForm")
	public String loginForm() {
		System.out.println("/ loginForm 요청///////");
		return "loginForm";
	}
	
	
}

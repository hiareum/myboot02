package com.myboot02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/")
	public String home(){
		System.out.println("nice");
		return "hi";
	}
	
	@RequestMapping("/hello.do")
	public String hello(Model model) {
		model.addAttribute("hi","hi¿‘¥œ¥Ÿ");
		return "hello";
	}
	
	@RequestMapping("/hello2.do")
	public String hello2() {
		return "hello2";
	}
	
	@RequestMapping("/hi.do")
	public String hi(Model model) {
		model.addAttribute("message","hi.jsp");
		return "hi";
	}
}

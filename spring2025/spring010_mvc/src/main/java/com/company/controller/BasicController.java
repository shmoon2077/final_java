package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class BasicController {
	@RequestMapping("/") 
	public String basic() { return "home"; }
	
	@RequestMapping("/basic1.do") 
		public String basic1 ( Model model ) { // 처리 결과를 Model 객체에 담기
			//1. 처리하고
			model.addAttribute("result","sallly");
			/* return "basic1.jsp"; */
			return "basic1"; //ViewResolver 떄문에 확장자와 경로를 안 적어도 인식함
		}
	}
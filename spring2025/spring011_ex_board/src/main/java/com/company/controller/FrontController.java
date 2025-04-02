package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class FrontController {
	@RequestMapping(value ="/list" , method=RequestMethod.GET)
	public String list () { return "board/list"; }
	
	@RequestMapping(value ="/create" , method=RequestMethod.GET)
	public String create () { return "board/write"; }
	
	@RequestMapping(value ="/create" , method=RequestMethod.POST)
	public String create_post () { return "board/write"; }

	@RequestMapping(value ="/detail" , method=RequestMethod.GET)
	public String detail () { return "board/detail"; }

	@RequestMapping(value ="/edit" , method=RequestMethod.GET)
	public String edit () { return "board/edit"; }
	
	@RequestMapping(value ="/edit" , method=RequestMethod.POST)
	public String edit_post () { return "board/edit"; }

	@RequestMapping(value ="/delete")  // 아무 것도 안 붙이면 GET
	public String delete () { return "board/delete"; }

	@RequestMapping(value ="/delete" , method=RequestMethod.POST)
	public String delete_post () { return "board/delete"; }

	
}


// 				http://localhost:8080/spring011_ex_board/board/list
//				http://localhost:8080/spring011_ex_board/board/write
//				http://localhost:8080/spring011_ex_board/board/detail
//				http://localhost:8080/spring011_ex_board/board/edit
//				http://localhost:8080/spring011_ex_board/board/delete
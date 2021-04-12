package com.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forum.service.Service;


@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired 
	private Service serv;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	
	
	
	
	
	
}

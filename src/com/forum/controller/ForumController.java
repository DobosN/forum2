package com.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forum.model.entities.Topic;
import com.forum.service.Service;

@Controller
@RequestMapping("/forum/")
public class ForumController {

	@Autowired 
	private Service serv;
	
	
	@GetMapping("/")
	public String get(Model model,String search) {
		
		
		if (search != null) {
			model.addAttribute("subcontent",serv.searchContent(search));
		}else {
			model.addAttribute("subcontent",serv.findAllContent());
		}
		
		model.addAttribute("topic",serv.findAllTopic());
		
		
		return "forum";
	}
	
	
	@PostMapping("/add")
	public String add(@ModelAttribute Topic t,Model model) {
		
		
		serv.addTopic(t);
		
		return "forum";
	}
	
	
	
}

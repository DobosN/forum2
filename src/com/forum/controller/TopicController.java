package com.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forum.model.entities.SubContent;
import com.forum.service.Service;

@Controller
@RequestMapping("/topic/")
public class TopicController {

	@Autowired 
	private Service serv;
	
	@GetMapping("/{topicId}")
	public String get(@PathVariable("topicId") Integer id,String search ,Model model) {
		

		
		model.addAttribute("topicId",id);
		
		if (search != null) {
			model.addAttribute("subcontent", serv.searchContent(search));
		}else if (id != null) {
			model.addAttribute("subcontent", serv.findSubContentById(id));
			model.addAttribute("topicId", id);
		}
		

		
		return "topic";
	}
	
	@PostMapping("/search")
	public String search(Model model) {
		
		String search =  model.getAttribute("search").toString();
		
		model.addAttribute("subcontent",serv.searchContent(search));
		
		return "topic";
	}
	
	@PostMapping("/{topicId}/add")
	public String add(@ModelAttribute SubContent sc,@PathVariable("topicId") Integer id ,Model model) {
		

		model.addAttribute("subcontent", new SubContent());

		serv.addSubContent(sc);
		
		return "topic";
	}
	
	
	
	
}

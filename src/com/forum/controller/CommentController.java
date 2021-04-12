package com.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forum.model.entities.Comment;
import com.forum.service.Service;

@Controller
@RequestMapping("/comment/")
public class CommentController {

	@Autowired 
	private Service serv;
	
	@GetMapping("/{contentId}")
	public String get(@PathVariable("contentId") Integer id,Model model) {
		
		
		model.addAttribute("topicId",id);
		
		model.addAttribute("subcontent", serv.findByContentId(id));
		model.addAttribute("comment",serv.findCommentByContentId(id));
		
		return "comment";
	}

	@PostMapping("/add")
	public String add(@ModelAttribute Comment c, Model model) {
		
		
		serv.addComment(c);
		
		return "comment";
	}
}

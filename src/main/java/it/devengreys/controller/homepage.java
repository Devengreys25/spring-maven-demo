package it.devengreys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homepage")
public class homepage {
	
	@RequestMapping("/")
	public String showPage() {
		return "homepage";
	}
	

}

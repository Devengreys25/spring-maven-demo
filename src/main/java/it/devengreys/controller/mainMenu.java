package it.devengreys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("menu")
public class mainMenu {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
}

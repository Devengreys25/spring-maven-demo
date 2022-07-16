package it.devengreys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class ApiController {

	@RequestMapping("user")
	public String showUser(@RequestParam String id) {
		return "api";
	}
	
}

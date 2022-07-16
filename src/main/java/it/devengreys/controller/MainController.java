package it.devengreys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/menu")
	public String showMenu() {
		return "menu";
	}
	
	@RequestMapping("/wallet")
	public String showWallet() {
		return "wallet";
	}
	
	@RequestMapping("/api")
	public String showApi() {
		return "api";
	}
	
}

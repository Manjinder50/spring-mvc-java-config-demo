package com.timbuchalka.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timbuchalka.springdemo.service.GenericWelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	GenericWelcomeService welcomeService;
	
	@RequestMapping
	public String doWelcome(Model model){
		//1. Retrieving the processed data
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Tim Buchlaka");
		
		//2.Adding the data to the model
		model.addAttribute("myWelcomeMessage",welcomeMessage);
		
		//3. Return Logical name
		return "welcomeNew";
		
	}
}

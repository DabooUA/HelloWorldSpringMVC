package com.gc.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Serhiy Bardysh
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld(Model model) {
		
		Person newPerson= new Person("Serhiy", "Bardysh");
		
		model.addAttribute("test1", newPerson);
		
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This message is coming from HomeController.java</h3>";
		return new ModelAndView("welcome", "message", message);
	}
}
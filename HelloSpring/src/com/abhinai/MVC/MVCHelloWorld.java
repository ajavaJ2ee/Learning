package com.abhinai.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCHelloWorld {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		
		String message= "<h1>Hello World MVC Project</h1>";
		
		return new ModelAndView("welcome","message",message);
	}

}

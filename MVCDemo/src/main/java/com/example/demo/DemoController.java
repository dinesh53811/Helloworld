package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController 
{
	@RequestMapping("/")
	public ModelAndView hi()
	{
		String msg="welcome to uppal";
		return new ModelAndView("welcome","msg",msg);
	}
	

}
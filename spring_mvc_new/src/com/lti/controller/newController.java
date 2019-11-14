package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class newController 
{

 @RequestMapping(value="/hi", method = RequestMethod.GET)
 public ModelAndView myMethod()
 {   
	 
	 ModelAndView model=new ModelAndView("hello");
	 model.addObject("bala","Akshay Kumar Rocks");
	 return model;
 }
 
 @RequestMapping(value = "/say",method = RequestMethod.GET)
 public ModelAndView  sayHello(@RequestParam("username")String name)
 {
	 ModelAndView model=new ModelAndView("sayHello");
	 model.addObject("name",name);
	 return model;
	 
 }
 
 @RequestMapping(value = "/prime",method = RequestMethod.GET)
 public ModelAndView  Prime(@RequestParam("number")int number)
 {int i;
 String message="not prime";

	for(i=2;i<=(number-1);i++)
	{
		if(number%i==0)
			break;
		

		
	}
	if(number==i)
		 message="prime hai";
	
		
	 ModelAndView model=new ModelAndView("result");
	 model.addObject("message",message);
	 return model;
	 
 }
}

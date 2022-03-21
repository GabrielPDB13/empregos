package com.empresa.empregos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	
	
	@RequestMapping(value= "/busca", method=RequestMethod.GET)
	public ModelAndView getBusca() 
	{
		ModelAndView mv=new ModelAndView("busca");
		return mv;
	}
	
	@RequestMapping(value= "/busca", method=RequestMethod.POST)
	public ModelAndView postBusca(@RequestParam("buscar") String bsc) 
	{
		ModelAndView mv=new ModelAndView("busca");
		mv.addObject("valor", bsc);
		return mv;
	}

}

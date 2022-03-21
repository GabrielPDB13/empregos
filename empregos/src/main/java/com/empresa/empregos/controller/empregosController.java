package com.empresa.empregos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.empresa.empregos.model.Empregos;
import com.empresa.empregos.repository.EmpregosRepository;

@Controller
public class empregosController {

	@Autowired
	EmpregosRepository vr;
	
	@RequestMapping(value= "/empregos", method=RequestMethod.GET)
	public ModelAndView getEmpregos() 
	{
		ModelAndView mv=new ModelAndView("empregos");
		
		mv.addObject("empregos", vr.findAll());
		
		return mv;
	}
	
	
	
	@RequestMapping(value= "/empregos", method=RequestMethod.POST)
	public ModelAndView postEmpregos(Empregos emp) 
	{
		vr.save(emp);
		ModelAndView mv=new ModelAndView("empregos");
		mv.addObject("mensagem", "Jogo adicionado com sucesso!!!");
		
		return mv;
	
	}
}	

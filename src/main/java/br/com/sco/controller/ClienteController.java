package br.com.sco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

	@RequestMapping(value="/ola")
	public ModelAndView olaMundo() {
		return new ModelAndView("hello");
	}
	
}

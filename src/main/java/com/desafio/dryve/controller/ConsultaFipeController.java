package com.desafio.dryve.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/consulta")
public class ConsultaFipeController {

	
	@RequestMapping(method=RequestMethod.GET)
	public String ola() {
		return "Rest Testado";
	}
	
}

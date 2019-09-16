package com.lab02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lab02.services.DisciplinaService;

@Controller
public class DisciplinaController {
	
	@Autowired
	DisciplinaService disciplinaService;
	
	public DisciplinaController() {
		this.disciplinaService = new DisciplinaService();
	}
	
	
	

}

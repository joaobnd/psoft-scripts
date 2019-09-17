package com.lab02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.lab02.services.DisciplinaService;

@RestController
public class DisciplinaController {
	
	@Autowired
	DisciplinaService disciplinaService;
	
	public DisciplinaController() {
		this.disciplinaService = new DisciplinaService();
	}
	
	
	

}

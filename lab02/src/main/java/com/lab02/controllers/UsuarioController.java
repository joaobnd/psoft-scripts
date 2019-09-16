package com.lab02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lab02.services.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	public UsuarioController() {
		
	}
	
	public ResponseEntity<Usuario> addUsuario(@RequestBody)
	
}

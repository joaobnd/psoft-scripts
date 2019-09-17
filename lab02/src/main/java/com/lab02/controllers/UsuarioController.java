package com.lab02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lab02.entities.Usuario;
import com.lab02.services.UsuarioService;

import net.bytebuddy.asm.Advice.This;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	public UsuarioController() {
		this.usuarioService = new UsuarioService();
	}
	
	@PostMapping("v1/auth/usuarios")
	public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
		return new ResponseEntity<Usuario>(this.usuarioService.addUsuario(usuario), HttpStatus.CREATED);
	}
	
	@GetMapping("v1/auth/usuarios/{email}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable String email) {
		Usuario resp = this.usuarioService.getUsuario(email);
		if(resp == null)
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Usuario>(resp, HttpStatus.OK);
	}
	
	//*@PostMapping("v1/auth/login")
	//*public ResponseEntity<Usuario> 
	
	
	
	
}

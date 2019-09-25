package com.lab02.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.lab02.entities.Usuario;

@Service
public class UsuarioService {
	
	private Map<String, Usuario> usuarios;
	
	public UsuarioService () {
		this.usuarios = new HashMap<>();
	}
	
	public Usuario addUsuario (Usuario usuario) {
		this.usuarios.put(usuario.getEmail(), usuario);
		return usuario;
	}
	
	public Usuario getUsuario(String email) {
		Usuario resp = usuarios.get(email);
		return resp;
	}
	
	public boolean checkUsuario(String email, String senha) {
		boolean resp = false;
		Usuario temp_user = usuarios.get(email);
		if(temp_user.getSenha() == senha) 
			resp = true;
		return resp;
	}
	
	
	
	
	
	
}

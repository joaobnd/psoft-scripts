package com.lab02.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lab02.entities.Disciplina;

@Service
public class DisciplinaService {
	
	private Map<Long, Disciplina> disciplinas;
	
	public DisciplinaService() {
		disciplinas = new HashMap<>();
	}
	
	public Disciplina getDisciplina(Long id) {
		Disciplina resp = disciplinas.get(id);
		return resp;
	}
	
	public Disciplina giveLike(Long id) {
		disciplinas.get(id).addLikes();
		return disciplinas.get(id);
	}
	
	public Disciplina attNota(Long id, Double nota) {
		disciplinas.get(id).setNota(nota);
		return disciplinas.get(id);
	}
	
	public Disciplina addComent(Long id, String comentario) {
		disciplinas.get(id).setComentarios(comentario);
		return disciplinas.get(id);
	}
	
	public List<Disciplina> rankDiscPorNota() {
		
	}

}

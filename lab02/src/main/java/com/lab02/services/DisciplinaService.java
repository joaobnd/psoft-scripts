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
	
	public List<Disciplina> rankingDisciplinaPorNota() {
		ArrayList<Disciplina> resp = new ArrayList<>(this.disciplinas.values());
		
		
	}

}

package services;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import entities.Disciplina;

@Service
public class DisciplinaService {

	private Map<Integer, Disciplina> disciplinas;
	private Integer index;
	
	public DisciplinaService() {
		this.disciplinas = new HashMap<>();
		this.index = 0;
	}
	public Disciplina setNovaDisciplina(Disciplina disciplina) {
		this.disciplinas.put(index++, disciplina);
		return disciplina;
	}
	
	public List<Disciplina> ListDisciplinas() {
		return new ArrayList<>(this.disciplinas.values());
	}
	
	public Disciplina getDisciplina(Integer id) {
		return this.disciplinas.get(id);
	}
	
	public Disciplina setNomeDisciplina(Integer id, String nome) {
		Disciplina disc = this.disciplinas.get(id);
		
		if(disc!= null) 
			disc.setNome(nome);
		
		return disc;
	}
	
	public Disciplina setNotaDisciplina(Integer id, Double nota) {
		Disciplina disc = this.disciplinas.get(id);
		
		if(disc != null) 
			disc.setNota(nota);
		
		return disc;
	}

	
}

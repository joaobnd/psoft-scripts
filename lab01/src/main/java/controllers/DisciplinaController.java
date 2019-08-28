package controllers;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Disciplina;
import services.DisciplinaService;

@RestController
public class DisciplinaController {
	
	@Autowired
	DisciplinaService disciplinaService;
	
	public DisciplinaController() {
		this.disciplinaService = new DisciplinaService();
	}
	
	@PostMapping("disciplinas")
	public ResponseEntity<Disciplina> setNovaDisciplina(@RequestBody Disciplina disciplina) {
		return new ResponseEntity<Disciplina>(this.disciplinaService.setNovaDisciplina(disciplina), HttpStatus.OK); 
	}
	
	@GetMapping("disciplinas")
	public ResponseEntity<List<Disciplina>> ListDisciplinas() {
		return new ResponseEntity<List<Disciplina>>(this.disciplinaService.listDisciplinas(), HttpStatus.OK);
	}
	
	@RequestMapping("disciplinas/{id}")
	public ResponseEntity<Disciplina> getDisciplina(@PathVariable Integer id) {
		Disciplina resp = this.disciplinaService.getDisciplina(id);
		
		if(resp == null)
			return new ResponseEntity<Disciplina>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Disciplina>(resp, HttpStatus.OK);
	}
	
	@PutMapping("disciplinas/{id}/nome")
	public ResponseEntity<Disciplina> setNomeDisciplina(@PathVariable Integer id, @RequestBody JSONObject json) {
		Disciplina resp = this.disciplinaService.setNomeDisciplina(id, json.get("nome").toString());
		
		if(resp == null) 
			return new ResponseEntity<Disciplina>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Disciplina>(resp, HttpStatus.OK);
	}
	
	@PutMapping("disciplinas/{id}/nota")
	public ResponseEntity<Disciplina> setNotaDisciplina(@PathVariable Integer id, @RequestBody JSONObject json) {
		Disciplina resp = this.disciplinaService.setNotaDisciplina(id, Double.parseDouble(json.get("nota").toString()));
		
		if(resp == null)
			return new ResponseEntity<Disciplina>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Disciplina>(resp, HttpStatus.OK);
	}
	
	@DeleteMapping("disciplinas/{id}")
	public ResponseEntity<Disciplina> removeDisciplina(@PathVariable Integer id) {
		Disciplina resp = this.disciplinaService.removeDisciplina(id);
		
		if(resp == null)
			return new ResponseEntity<Disciplina>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Disciplina>(resp, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Disciplina>> rankingDisciplinas() {
		return new ResponseEntity<List<Disciplina>>(this.disciplinaService.rankingDisciplinas(), HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
}

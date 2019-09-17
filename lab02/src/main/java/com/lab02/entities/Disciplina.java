package com.lab02.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Disciplina {
	
	@Id
	private Long id;
	private String nome;
	private Double nota;
	private String comentarios;
	private Integer likes;
	
	public Disciplina(Long id, String nome, Double nota, String comentarios) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.comentarios = comentarios;
		this.likes = 0;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public Integer getLikes() {
		return likes;
	}
	public void addLikes() {
		this.likes++;
	}

	

	
	
	
	

}

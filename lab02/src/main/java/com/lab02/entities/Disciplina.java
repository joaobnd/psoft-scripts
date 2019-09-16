package com.lab02.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina {
	
	@Id
	private Long id;
	private String nome;
	private Double nota;
	private String comentarios;
	private Integer likes;
	
	public Disciplina() {
		
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
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	
	

}

package entities;

public class Disciplina implements Comparable<Disciplina> {
	
	private Integer id;
	private String nome;
	private Double nota;
	
	public Disciplina() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int compareTo(Disciplina outraDisc) {
		int resp;
		
		if(this.nota < outraDisc.getNota()) 
			resp = -1;
		else if (this.nota > outraDisc.getNota())
			resp = 1;
		else
			resp = 0;
		return resp;
	}
}



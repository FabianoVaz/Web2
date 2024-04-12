package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Aluno {

	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno() {
		super();
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}

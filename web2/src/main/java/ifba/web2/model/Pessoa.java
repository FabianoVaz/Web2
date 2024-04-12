package ifba.web2.model;

public class Pessoa {

	private int id;
	private String nome;
	private float salario;
	
	public Pessoa(String nome, float salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public Pessoa() {
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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}

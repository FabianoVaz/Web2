package testes;

import controller.DaoAluno;
import model.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		// 1. Coletar dados
		String nome = "Maria";
		int idade = 21;
		
		// 2. Construir objetos
		Aluno aluno = new Aluno(nome, idade);
		
		// 3. Manipular o objeto
		DaoAluno dao = new DaoAluno();
//		dao.add(aluno);
		
		for(Aluno a : dao.listar()) {
			System.out.println( "Nome:" + a.getNome() + "\tIdade: " +a.getIdade());
		}
		
	}
}

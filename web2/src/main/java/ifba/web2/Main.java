package ifba.web2;

import dao.DaoPessoa;
import ifba.web2.model.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("João", 1000);
		
		DaoPessoa dao = new DaoPessoa();
		dao.add(p1);
		
		for(Pessoa p : dao.list()) {
			System.out.println(p.getNome());
		}
	}

}

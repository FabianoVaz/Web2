package dao;

import java.util.ArrayList;
import java.util.List;

import ifba.web2.model.Pessoa;

public class DaoPessoa {

	static List<Pessoa> lista = new ArrayList<Pessoa>();
	
	// CRUD
	public void add(Pessoa pessoa) {
		lista.add(pessoa);
	}
	
	public void update(Pessoa pessoa) {
		// UPDATE
	}
	
	public void remove(Pessoa pessoa) {
		// DELETE
		lista.remove(pessoa);
	}
	
	public List<Pessoa> list() {
		// SELECT
		return lista;
	}
	
	public Pessoa findById(int key) {
		// SELECT
		for(Pessoa p : lista) {
			if(key == p.getId())
				return p;
		}
		return null;
	}
}

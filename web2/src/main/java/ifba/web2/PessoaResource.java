package ifba.web2;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dao.DaoPessoa;
import ifba.web2.model.Pessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {
	
	DaoPessoa dao = new DaoPessoa();

	@PostMapping("/")
	public Pessoa inserir(@RequestBody Pessoa p ) {
		dao.add(p);
		return p;
	}
	
	@GetMapping("/add")
	public Pessoa inserir(@RequestParam("nome") String nome, @RequestParam("sal") float sal ) {
		Pessoa p = new Pessoa(nome, sal);
		dao.add(p);
		return p;
	}
	
	@DeleteMapping("/{id}")
	public boolean excluir(@PathVariable int id ) {
		dao.remove(dao.findById(id));
		return true;
	}
	
	@PutMapping("/{id}")
	public Pessoa atualizar(@PathVariable int id, @RequestBody Pessoa p ) {
		dao.update(p);
		return p;
	}
	
	@GetMapping("/{id}")
	public Pessoa procurar(@PathVariable int id ) {
		return dao.findById(id);
	}
	
	@GetMapping("/")
	public List<Pessoa> list() {
		return dao.list();
	}
	
}

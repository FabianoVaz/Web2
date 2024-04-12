package ifba.web2.projeto.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ifba")
public class PessoaController {

	@Autowired
	PessoaRepository repo;
	
	@PostMapping // POST localhost:8080/ifba
	public Pessoa salvar(@RequestBody Pessoa p) {
		return repo.save(p);
	}
	
	@GetMapping // GET localhost:8080/ifba
	public List<Pessoa> listar() {
		return repo.findAll();
	}
	
	@PutMapping // PUT localhost:8080/ifba
	public Pessoa editar(@RequestBody Pessoa p) {
		return repo.save(p);
	}
	
	@DeleteMapping("/{id}") // DELETE localhost:8080/ifba/3
	public void excluir(@PathVariable int id) {
		repo.deleteById(id);
	}
}

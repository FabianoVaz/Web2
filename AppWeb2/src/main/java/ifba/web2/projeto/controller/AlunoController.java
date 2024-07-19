package ifba.web2.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifba.web2.projeto.basica.Aluno;
import ifba.web2.projeto.repo.AlunoRepo;

/**
 - inserir:		POST(Aluno aluno)			// aluno   -> Aluno
 - deletar: 	DELETE(int id)				// aluno/id -> null
 - editar: 		PUT(int id, Aluno aluno)	// aluno/id -> Aluno
 - listar: 		GET()						// aluno	<- JSON (array)
 - localizar: 	GET(int id)					// aluno/id <- JSON (objeto)
 */

@RestController
@RequestMapping("aluno")
public class AlunoController {

	@Autowired
	private AlunoRepo repo;
	
	@PostMapping
	public Aluno inserir(@RequestBody Aluno aluno) {
		return repo.save(aluno);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void editar(@PathVariable int id, @RequestBody Aluno aluno) {
		// melhorar aqui
		repo.save(aluno);
	}
	
	@GetMapping
	public List<Aluno> listar(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Aluno> localizarPorId(@PathVariable int id) {
		return repo.findById(id);
	}
	
}

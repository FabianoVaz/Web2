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

import ifba.web2.projeto.basica.Curso;
import ifba.web2.projeto.repo.CursoRepo;

/**
 - inserir:		POST(Curso curso)			// curso   -> Curso
 - deletar: 	DELETE(int id)				// curso/id -> null
 - editar: 		PUT(int id, Curso curso)	// curso/id -> Curso
 - listar: 		GET()						// curso	<- JSON (array)
 - localizar: 	GET(int id)					// curso/id <- JSON (objeto)
 */

@RestController
@RequestMapping("curso")
public class CursoController {

	@Autowired
	private CursoRepo repo;
	
	@PostMapping
	public Curso inserir(@RequestBody Curso curso) {
		return repo.save(curso);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void editar(@PathVariable int id, @RequestBody Curso curso) {
		// melhorar aqui
		repo.save(curso);
	}
	
	@GetMapping
	public List<Curso> listar(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Curso> localizarPorId(@PathVariable int id) {
		return repo.findById(id);
	}
	
}

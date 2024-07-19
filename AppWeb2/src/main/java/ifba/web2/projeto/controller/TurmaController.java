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
import ifba.web2.projeto.basica.Turma;
import ifba.web2.projeto.repo.TurmaRepo;

@RestController
@RequestMapping("turma")
public class TurmaController {

	@Autowired
	private TurmaRepo repo;
	
	@PostMapping
	public Turma inserir(@RequestBody Turma turma) {
		return repo.save(turma);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	@PutMapping()
	public void editar(@PathVariable int id, @RequestBody Turma turma) {
		// melhorar aqui
		repo.save(turma);
	}
	
	@GetMapping
	public List<Turma> listar(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Turma> localizarPorId(@PathVariable int id) {
		return repo.findById(id);
	}
	
	// ==========================
	@PutMapping("/matricula/{id}")
	public Turma matricular(@PathVariable int id, @RequestBody Aluno aluno) {
		Turma turma = repo.findById(id).get();
		turma.matricular(aluno);
		return repo.save(turma);
	}
	
	@DeleteMapping("/matricula/{id}")
	public Turma desmatricular(@PathVariable int id, @RequestBody Aluno aluno) {
		Turma turma = repo.findById(id).get();
		turma.desmatricular(aluno);
		return repo.save(turma);
	}
}

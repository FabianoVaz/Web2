package ifba.web2.projeto.basica;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Turma {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	
	@ManyToOne
	private Curso curso;
	
	@OneToMany
	private List<Aluno> alunos;
	
	public void matricular(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public boolean desmatricular(Aluno aluno) {
		for (Aluno a : alunos) {
			if(a.getId() == aluno.getId()) {
				return alunos.remove(a);
			}
		}
		return false;
	}
}

package ifba.web2.projeto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifba.web2.projeto.basica.Curso;

@Repository
public interface CursoRepo extends JpaRepository<Curso, Integer>{

}

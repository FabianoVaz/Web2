package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Pessoa;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Integer> {

}

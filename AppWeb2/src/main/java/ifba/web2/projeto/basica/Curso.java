package ifba.web2.projeto.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Curso {

	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	private String modalidade;
}

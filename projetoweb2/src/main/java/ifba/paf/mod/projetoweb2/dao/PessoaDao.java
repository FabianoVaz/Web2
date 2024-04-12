package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.PessoaRepositorio;

@Service
public class PessoaDao {

    //@Autowired
    private PessoaRepositorio repo = new PessoaDao();

    public Pessoa save(Pessoa obj){
        return repo.save(obj);
    }
    
    public List<Pessoa> list(){
        return repo.findAll();
    }
}

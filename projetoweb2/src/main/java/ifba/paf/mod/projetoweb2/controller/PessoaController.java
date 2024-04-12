package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.PessoaDao;
import model.Pessoa;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaDao dao;

    @PostMapping
    public String add(@RequestBody Pessoa pessoa){
        dao.save(pessoa);
        return "Cadastro realizado com sucesso!";
    }

    @GetMapping
    public List<Pessoa> list(){
        return dao.list();
    }
}

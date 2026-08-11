package com.janayna.cursos_pweb1.controllers;

import com.janayna.cursos_pweb1.entities.Instrutor;
import com.janayna.cursos_pweb1.repositories.InstrutorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Definindo a classe como um controlador REST e mapeando a rota base para "/instrutores"
@RestController
//Define a rota base para todos os métodos do controlador
@RequestMapping("/instrutores")
public class InstrutorController {

    private final InstrutorRepository repository;

        public InstrutorController(InstrutorRepository repository) {
        this.repository = repository;
    }
    //Método que será chamado por uma requisição GET para listar todos os instrutores
    @GetMapping
    public List<Instrutor> listar() {
        return repository.findAll();
    }
    //Método que será chamado por uma requisição POST for feita para a rota "/instrutores", para salvar um novo instrutor no banco de dados
    //RequestBody indica que o corpo da requisição será convertido em um objeto Instrutor
    @PostMapping
    public Instrutor salvar(@RequestBody Instrutor instrutor) {
        return repository.save(instrutor);
    }
}
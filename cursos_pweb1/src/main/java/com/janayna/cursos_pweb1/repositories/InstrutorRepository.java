package com.janayna.cursos_pweb1.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.janayna.cursos_pweb1.entities.Instrutor;

import java.util.List;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {
    
    //Consulta personalizada para buscar instrutores pelo nome
    List<Instrutor> findByNameContaining(String nome);
}

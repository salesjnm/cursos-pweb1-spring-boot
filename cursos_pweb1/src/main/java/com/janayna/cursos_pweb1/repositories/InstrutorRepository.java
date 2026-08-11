package com.janayna.cursos_pweb1.repositories;

import com.janayna.cursos_pweb1.entities.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {

    // Altere "Name" para "Nome"
    List<Instrutor> findByNomeContaining(String nome);
}

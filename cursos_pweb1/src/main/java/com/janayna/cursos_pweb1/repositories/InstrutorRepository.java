package com.janayna.cursos_pweb1.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.janayna.cursos_pweb1.entities.Instrutor;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {
    
}

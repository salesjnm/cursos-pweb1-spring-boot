package com.janayna.cursos_pweb1.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.janayna.cursos_pweb1.entities.Aula;


@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {
    
}

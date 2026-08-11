package com.janayna.cursos_pweb1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.janayna.cursos_pweb1.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
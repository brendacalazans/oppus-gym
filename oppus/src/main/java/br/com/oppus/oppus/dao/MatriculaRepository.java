package br.com.oppus.oppus.dao;

import br.com.oppus.oppus.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    Matricula findByEmail(String email);
}

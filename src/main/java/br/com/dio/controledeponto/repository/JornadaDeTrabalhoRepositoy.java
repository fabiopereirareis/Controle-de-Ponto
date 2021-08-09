package br.com.dio.controledeponto.repository;

import br.com.dio.controledeponto.model.JornadaDeTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaDeTrabalhoRepositoy extends JpaRepository<JornadaDeTrabalho, Integer> {
}

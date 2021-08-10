package br.com.dio.controledeponto.repository;

import br.com.dio.controledeponto.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia,Integer> {
}

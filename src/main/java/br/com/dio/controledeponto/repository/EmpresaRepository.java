package br.com.dio.controledeponto.repository;

import br.com.dio.controledeponto.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository  extends JpaRepository<Empresa,Integer> {
}

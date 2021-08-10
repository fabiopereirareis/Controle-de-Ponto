package br.com.dio.controledeponto.repository;

import br.com.dio.controledeponto.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData,String> {
}

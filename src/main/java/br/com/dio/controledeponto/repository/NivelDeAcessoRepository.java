package br.com.dio.controledeponto.repository;

import br.com.dio.controledeponto.model.NivelDeAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelDeAcessoRepository extends JpaRepository<NivelDeAcesso,Integer> {
}

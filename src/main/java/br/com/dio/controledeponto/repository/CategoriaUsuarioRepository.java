package br.com.dio.controledeponto.repository;

import br.com.dio.controledeponto.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Integer> {
}

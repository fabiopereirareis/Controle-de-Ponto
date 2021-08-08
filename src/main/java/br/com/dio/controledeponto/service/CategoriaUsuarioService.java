package br.com.dio.controledeponto.service;

import br.com.dio.controledeponto.model.CategoriaUsuario;
import br.com.dio.controledeponto.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaUsuarioService {
    @Autowired
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository){
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public CategoriaUsuario saveCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> getListAllCategoriaUsuario(){
        return categoriaUsuarioRepository.findAll();
    }

    public CategoriaUsuario updateCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public void deleteCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        categoriaUsuarioRepository.delete(categoriaUsuario);
    }
}

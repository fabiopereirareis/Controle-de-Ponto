package br.com.dio.controledeponto.controller;

import br.com.dio.controledeponto.model.CategoriaUsuario;
import br.com.dio.controledeponto.service.CategoriaUsuarioService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria_usuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Salvar Categoria")
    public CategoriaUsuario saveCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
    }

    @GetMapping
    @ApiOperation(value = "Listar todas categorias de usuário")
    public List<CategoriaUsuario> getListAllCategoriaUsuario(){
        return categoriaUsuarioService.getListAllCategoriaUsuario();
    }

    @PutMapping
    @ApiOperation(value = "Atualizar categoria usuário")
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuario);
    }

    @DeleteMapping
    @ApiOperation(value = "Deletar categoria usuário")
    public void deleteCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        categoriaUsuarioService.deleteCategoriaUsuario(categoriaUsuario);
    }
}

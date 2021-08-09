package br.com.dio.controledeponto.controller;

import br.com.dio.controledeponto.model.NivelDeAcesso;
import br.com.dio.controledeponto.service.NivelDeAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivel_de_acesso")
public class NivelDeAcessoController {

    @Autowired
    NivelDeAcessoService nivelDeAcessoService;

    @PostMapping
    public NivelDeAcesso saveNivelDeAcesso(NivelDeAcesso nivelDeAcesso){
        return nivelDeAcessoService.saveNivelDeAcesso(nivelDeAcesso);
    }

    @GetMapping
    public List<NivelDeAcesso> getAllNivelDeAcessos(){
        return nivelDeAcessoService.getAllNivelDeAcesso();
    }

    @PutMapping
    public NivelDeAcesso updateNivelDeAcesso(NivelDeAcesso nivelDeAcesso){
        return nivelDeAcessoService.updateNivelDeAcesso(nivelDeAcesso);
    }

    @DeleteMapping
    public void deleteNivelDeAcesso(NivelDeAcesso nivelDeAcesso){
        nivelDeAcessoService.deleteNivelDeAcesso(nivelDeAcesso);
    }
}

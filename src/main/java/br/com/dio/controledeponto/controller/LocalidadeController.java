package br.com.dio.controledeponto.controller;

import br.com.dio.controledeponto.model.Localidade;
import br.com.dio.controledeponto.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade saveLocalidade(Localidade localidade){
        return localidadeService.saveLocalidade(localidade);
    }

    @GetMapping
    public List<Localidade> getAllLocalidades(){
        return localidadeService.getAllLocalidades();
    }

    @PutMapping
    public Localidade updateLocalidade(Localidade localidade){
        return localidadeService.updateLocalidade(localidade);
    }

    @DeleteMapping
    public void deleteLocalidade(Localidade localidade){
        localidadeService.deleteLocalidade(localidade);
    }
}

package br.com.dio.controledeponto.controller;

import br.com.dio.controledeponto.model.JornadaDeTrabalho;
import br.com.dio.controledeponto.service.JornadaDeTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada_de_trabalho")
public class JornadaDeTrabalhoController {
    @Autowired
    JornadaDeTrabalhoService jornadaDeTrabalhoService;

    @PostMapping
    public JornadaDeTrabalho saveJornadaDeTrabalho(JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaDeTrabalhoService.saveJornadaDeTrabalho(jornadaDeTrabalho);
    }

    @GetMapping
    public List<JornadaDeTrabalho> getAllJornadaDeTrabalho(){
        return jornadaDeTrabalhoService.getAllJornadaDeTrabalho();
    }

    @PutMapping
    public JornadaDeTrabalho updateJornadaDeTrabalho(JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaDeTrabalhoService.updateJornadaDeTrabalho(jornadaDeTrabalho);
    }

    @DeleteMapping
    public void deleteJornadaDeTrabalho(JornadaDeTrabalho jornadaDeTrabalho){
        jornadaDeTrabalhoService.deleteJornadaDeTrabalho(jornadaDeTrabalho);
    }
}

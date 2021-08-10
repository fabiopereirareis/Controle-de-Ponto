package br.com.dio.controledeponto.controller;

import br.com.dio.controledeponto.model.Ocorrencia;
import br.com.dio.controledeponto.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getAllOcorrencias(){
        return ocorrenciaService.getAllOcorrencias();
    }

    @PutMapping
    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }

    @DeleteMapping
    public void deleteOcorrencia(Ocorrencia ocorrencia){
        ocorrenciaService.deleteOcorrencia(ocorrencia);
    }

}

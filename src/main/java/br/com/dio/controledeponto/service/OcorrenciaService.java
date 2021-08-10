package br.com.dio.controledeponto.service;

import br.com.dio.controledeponto.model.Ocorrencia;
import br.com.dio.controledeponto.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcorrenciaService {
    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository){
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public List<Ocorrencia> getAllOcorrencias(){
        return ocorrenciaRepository.findAll();
    }

    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void deleteOcorrencia(Ocorrencia ocorrencia){
        ocorrenciaRepository.delete(ocorrencia);
    }
}

package br.com.dio.controledeponto.service;

import br.com.dio.controledeponto.model.Localidade;
import br.com.dio.controledeponto.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadeService {
    @Autowired
    LocalidadeRepository localidadeRepository;

    public LocalidadeService(LocalidadeRepository localidadeRepository){
        this.localidadeRepository = localidadeRepository;
    }

    public Localidade saveLocalidade(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public List<Localidade> getAllLocalidades(){
        return localidadeRepository.findAll();
    }

    public Localidade updateLocalidade(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public void deleteLocalidade(Localidade localidade){
        localidadeRepository.delete(localidade);
    }
}

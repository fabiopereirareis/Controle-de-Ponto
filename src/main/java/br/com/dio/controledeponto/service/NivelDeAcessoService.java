package br.com.dio.controledeponto.service;

import br.com.dio.controledeponto.model.NivelDeAcesso;
import br.com.dio.controledeponto.repository.NivelDeAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelDeAcessoService {

    @Autowired
    NivelDeAcessoRepository nivelDeAcessoRepository;

    public NivelDeAcessoService(NivelDeAcessoRepository nivelDeAcessoRepository){
        this.nivelDeAcessoRepository =nivelDeAcessoRepository;
    }

    public NivelDeAcesso saveNivelDeAcesso(NivelDeAcesso nivelDeAcesso){
        return nivelDeAcessoRepository.save(nivelDeAcesso);
    }

    public List<NivelDeAcesso> getAllNivelDeAcesso(){
        return nivelDeAcessoRepository.findAll();
    }

    public NivelDeAcesso updateNivelDeAcesso(NivelDeAcesso nivelDeAcesso){
        return nivelDeAcessoRepository.save(nivelDeAcesso);
    }

    public void deleteNivelDeAcesso(NivelDeAcesso nivelDeAcesso){
        nivelDeAcessoRepository.delete(nivelDeAcesso);
    }
}

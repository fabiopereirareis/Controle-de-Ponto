package br.com.dio.controledeponto.service;

import br.com.dio.controledeponto.model.TipoData;
import br.com.dio.controledeponto.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDataService {
    @Autowired
    TipoDataRepository tipoDataRepository;

    public TipoDataService(TipoDataRepository tipoDataRepository){
        this.tipoDataRepository = tipoDataRepository;
    }

    public TipoData saveTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public List<TipoData> getAllTipoData(){
        return tipoDataRepository.findAll();
    }

    public TipoData updateTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public void deleteTipoData(TipoData tipoData){
        tipoDataRepository.delete(tipoData);
    }
}

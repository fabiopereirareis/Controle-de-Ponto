package br.com.dio.controledeponto.controller;

import br.com.dio.controledeponto.model.TipoData;
import br.com.dio.controledeponto.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tipo_data")
@RestController
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData saveTipoData(TipoData tipoData){
        return tipoDataService.saveTipoData(tipoData);
    }

    @GetMapping
    public List<TipoData> getAllTipoData(){
        return tipoDataService.getAllTipoData();
    }

    @PutMapping
    public TipoData updateTipoData(TipoData tipoData){
        return tipoDataService.updateTipoData(tipoData);
    }

    @DeleteMapping
    public void deleteTipoData(TipoData tipoData){
        tipoDataService.deleteTipoData(tipoData);
    }
}



package br.com.dio.controledeponto.controller;

import br.com.dio.controledeponto.model.Empresa;
import br.com.dio.controledeponto.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa saveEmpresa(Empresa empresa){
        return empresaService.saveEmpresa(empresa);
    }

    @GetMapping
    public List<Empresa> getAllEmpresa(){
        return empresaService.getAllEmpresa();
    }

    @PutMapping
    public Empresa updateEmpresa(Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping
    public void deleteEmpresa(Empresa empresa){
        empresaService.deleteEmpresa(empresa);
    }
}

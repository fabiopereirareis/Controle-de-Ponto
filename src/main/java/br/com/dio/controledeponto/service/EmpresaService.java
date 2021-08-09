package br.com.dio.controledeponto.service;

import br.com.dio.controledeponto.model.Empresa;
import br.com.dio.controledeponto.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public Empresa saveEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> getAllEmpresa(){
        return empresaRepository.findAll();
    }

    // deu problema na hora de atualizar só altera onde foi mudado
    // e os outros campos ficam null

    public Empresa updateEmpresa(Empresa empresa) {
        Empresa empresaEncontrada = empresaRepository.getById(empresa.getCodigoDaEmpresa());
        if (empresa.getBairroEmpresa() != null) {
            empresaEncontrada.setBairroEmpresa(empresa.getBairroEmpresa());
        } else if (empresa.getCidadeEmpresa() != null) {
            empresaEncontrada.setCidadeEmpresa(empresa.getCidadeEmpresa());
        } else if (empresa.getDescricaoEmpresa() != null) {
            empresaEncontrada.setDescricaoEmpresa(empresa.getDescricaoEmpresa());
        } else if (empresa.getEstadoEmpresa() != null) {
            empresaEncontrada.setEstadoEmpresa(empresa.getEstadoEmpresa());
        } else if (empresa.getNumeroCNPJ() != 0) {
            empresaEncontrada.setNumeroCNPJ(empresa.getNumeroCNPJ());
        } else if (empresa.getTelefoneEmpresa() != 0) {
            empresaEncontrada.setTelefoneEmpresa(empresa.getTelefoneEmpresa());
        }
            return empresaRepository.save(empresaEncontrada);
    }

    public void deleteEmpresa(Empresa empresa){
        empresaRepository.delete(empresa);
    }
}

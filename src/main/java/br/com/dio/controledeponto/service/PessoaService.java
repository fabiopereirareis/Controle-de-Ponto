package br.com.dio.controledeponto.service;

import br.com.dio.controledeponto.model.Pessoa;
import br.com.dio.controledeponto.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PessoaService {
    @Autowired // essa notação é a mesma coisa de instânciar o objeto
    PessoaRepository pessoaRepository; // seria com PessoaRepository teste = new PessoaRepository

    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa savePessoa(Pessoa objetoPessoa){
        return pessoaRepository.save(objetoPessoa);
    }

    public List<Pessoa> listPessoa(){
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> pessoaByID(Integer id){
        return pessoaRepository.findById(id);

    }

    public Pessoa upDatePessoa(Pessoa objetoPessoa){
        return pessoaRepository.save(objetoPessoa);
    }

    public void deletePessoaByID(Integer id){
        pessoaRepository.deleteById(id);
    }

    public List<Pessoa> findByNome(String nome){
        return pessoaRepository.findByNomeContains(nome).stream()
                .collect(Collectors.toList());
    }


}

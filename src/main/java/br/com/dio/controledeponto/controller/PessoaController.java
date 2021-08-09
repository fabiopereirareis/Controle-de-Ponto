package br.com.dio.controledeponto.controller;

import br.com.dio.controledeponto.model.Pessoa;
import br.com.dio.controledeponto.service.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.el.ELException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/pessoa")
@Api(value = "Controle de Ponto") // nome retirado da SwaggerConfig
@CrossOrigin(origins = "*") // liberando qualquer domínio, sem restrição
public class PessoaController {

//    PessoaService pessoaService = new PessoaService(); // método tradicional sem anotação @Autowired
    @Autowired
    PessoaService pessoaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Adiciona pessoa")
    public Pessoa createPessoa(@RequestBody Pessoa pessoa){
        return pessoaService.savePessoa(pessoa);
    }

    @GetMapping
    @ApiOperation(value = "Lista todas pessoas")
    public List<Pessoa> getPessoaList(){
        return pessoaService.listPessoa();
    }

    @GetMapping("/{idpessoa}")
    @ApiOperation(value = "Lista pessoa por id")
    public ResponseEntity<Pessoa> getPessoaByID(@PathVariable("idpessoa")Integer id) throws Exception{
        return ResponseEntity.ok(pessoaService.pessoaByID(id).orElseThrow(() -> new ELException("Deu ruim")));
    }

    @PutMapping
    @ApiOperation(value = "Atualiza pessoa")
    public Pessoa updatePessoa(@RequestBody Pessoa pessoa){
        return pessoaService.upDatePessoa(pessoa);
    }

    @DeleteMapping("/{idpessoa}")
    @ApiOperation(value = "Deletar pessoa")
    public void deletePessoaByID(@PathVariable("idpessoa")Integer id){
        pessoaService.deletePessoaByID(id);
    }

    @GetMapping(value = "/filtro")
    public List<Pessoa> findByNome(@RequestParam("nome") String nome){
        return pessoaService.findByNome(nome);
    }

}

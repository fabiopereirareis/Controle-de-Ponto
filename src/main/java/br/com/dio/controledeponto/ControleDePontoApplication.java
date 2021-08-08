package br.com.dio.controledeponto;

import br.com.dio.controledeponto.model.Pessoa;
import br.com.dio.controledeponto.model.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;

@SpringBootApplication
public class ControleDePontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDePontoApplication.class, args);

		System.out.println("Ola Mundo");

//		Pessoa pessoa = new Pessoa(1,"João");
//		System.out.println(pessoa.getNome());
//
//		Produto produto = new Produto(1,"Forno Elétrico");
//
//		System.out.println(produto.getDescricao());

	}


}

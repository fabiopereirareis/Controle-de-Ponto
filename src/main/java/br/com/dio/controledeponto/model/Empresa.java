package br.com.dio.controledeponto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue
    int codigoDaEmpresa;
    String descricaoEmpresa;
    long numeroCNPJ; // int não suportou um número grande
    String enderecoEmpresa;
    String bairroEmpresa;
    String cidadeEmpresa;
    String estadoEmpresa;
    long telefoneEmpresa; // int não suportou número grande

}

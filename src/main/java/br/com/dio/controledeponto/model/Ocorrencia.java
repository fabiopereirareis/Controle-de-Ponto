package br.com.dio.controledeponto.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "tb_ocorrencia")
public class Ocorrencia {
    @Id
    @GeneratedValue
    private int codigoOcorrencia;
    private String nomeOcorrencia;
    private String descricaoFormulaOcorrencia;

}

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
@Entity(name = "tb_jornada_de_trabalho")
public class JornadaDeTrabalho {
    @Id
    @GeneratedValue
    int codigoJornadaTrabalho;
    String descricao;
}

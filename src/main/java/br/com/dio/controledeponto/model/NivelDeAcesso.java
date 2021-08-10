package br.com.dio.controledeponto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_nivel_de_acesso")
public class NivelDeAcesso {

    @Id
    @GeneratedValue
    long codigoNivelDeAcesso;

    String descricaoNivelDeAcesso;


}

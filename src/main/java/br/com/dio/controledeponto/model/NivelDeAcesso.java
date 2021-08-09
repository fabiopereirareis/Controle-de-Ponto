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
@Entity(name = "nivel_de_acesso")
public class NivelDeAcesso {
    @Id
    @GeneratedValue
    int codigoNivelDeAcesso;
    String descricaoNivelDeAcesso;

}

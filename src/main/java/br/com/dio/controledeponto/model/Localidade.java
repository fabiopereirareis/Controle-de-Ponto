package br.com.dio.controledeponto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_localidade")
public class Localidade {

    @Id
    @GeneratedValue
    private long codigoLocalidade;

    @ManyToOne
    private NivelDeAcesso codigoNivelDeAcesso;

    private String descricaoLocalidade;
}



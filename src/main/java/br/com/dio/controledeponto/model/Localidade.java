package br.com.dio.controledeponto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_localidade")
public class Localidade {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ChavesComposta codigoLocalidade;
    private String descricaoLocalidade;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class ChavesComposta implements Serializable {

        private long codigoLocalidade;
        private long codigoNivelDeAcesso;

    }
}


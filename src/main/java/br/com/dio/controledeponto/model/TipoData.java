package br.com.dio.controledeponto.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "tb_tipo_data")
public class TipoData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tipoData;
    private String descricaoTipoData;
}

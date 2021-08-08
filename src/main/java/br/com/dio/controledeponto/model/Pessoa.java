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
@Entity(name = "pessoa")
public class Pessoa {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // essa notação atrapalhou no update do crud
    // ela cria sempre um novo id, e com isso não da possibilidade de alterar os dados
    // pois sempre criava um novo objeto e não modificava o existente
    @GeneratedValue
    private int id;
    private String nome;


    }


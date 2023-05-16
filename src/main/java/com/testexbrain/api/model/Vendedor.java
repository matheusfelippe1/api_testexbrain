package com.testexbrain.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //DATA REALIZA TODOS MEUS GET E SET DOS MEUS ATRIBUTOS
@AllArgsConstructor //TODOS MEUS POSSIVEIS CONSTRUTORES
@NoArgsConstructor  //TODOS MEUS POSSIVEIS CONSTRUTORES VAZIO
@Entity
@Table(name = "VENDEDOR")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Vendedor(String nome) {
        this.nome = nome;
    }
}
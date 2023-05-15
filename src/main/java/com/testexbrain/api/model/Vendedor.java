package com.testexbrain.api.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vendedor")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "vendedor")
    private List<Venda> vendas = new ArrayList<>();

    public Vendedor() {
    }

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Venda> getVendas() {
        return vendas;
    }
    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

}

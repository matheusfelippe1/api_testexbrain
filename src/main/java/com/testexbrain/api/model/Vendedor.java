package com.testexbrain.api.model;

public class Vendedor {

    private Long id;
    private String nome;

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

}

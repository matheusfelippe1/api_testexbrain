package com.testexbrain.api.model;

import java.time.LocalDateTime;

public class Venda {

    private Long id;
    private LocalDateTime dataVenda;
    private Double valor;
    private Vendedor vendedor;

    public Venda() {

    }

    public Venda(LocalDateTime dataVenda, double valor, Vendedor vendedor) {
        this.dataVenda = dataVenda;
        this.valor = valor;
        this.vendedor = vendedor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

}

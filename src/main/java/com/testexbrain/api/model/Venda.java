package com.testexbrain.api.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataVenda = LocalDateTime.now();
    private Double valor;
    @ManyToOne
    private Vendedor vendedor;

    public Venda() {

    }

    public Venda(Double valor){
        this.valor = valor;
    }

    public Venda(String nome, String matheus, Vendedor vendedor) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Objects.equals(id, venda.id) && Objects.equals(dataVenda, venda.dataVenda) && Objects.equals(valor, venda.valor) && Objects.equals(vendedor, venda.vendedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataVenda, valor, vendedor);
    }
}

package com.testexbrain.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VENDA")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataVenda = LocalDateTime.now();
    private Double valor;
    @ManyToOne
    //@JoinColumn(name = "id_vendedor", referencedColumnName = "id")
    private Vendedor vendedor;

    public Venda(double valor, Vendedor vendedor) {
        this.valor = valor;
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

package com.testexbrain.api.controller.form;

import com.testexbrain.api.model.Venda;
import com.testexbrain.api.model.Vendedor;
import com.testexbrain.api.repository.VendaRepository;
import com.testexbrain.api.repository.VendedorRepository;
import jakarta.validation.constraints.NotNull;

public class AtualizaVendaForm {

    @NotNull
    private double valor;
    @NotNull
    private Long idVendedor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Long getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Long idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Venda atualizar(Long id, VendaRepository repository, VendedorRepository vendedorRepository) {
        Venda venda = repository.getReferenceById(id);
        Vendedor vendedor = vendedorRepository.getReferenceById(this.idVendedor);

        venda.setValor(this.valor);
        venda.setVendedor(vendedor);

        return venda;
    }

}

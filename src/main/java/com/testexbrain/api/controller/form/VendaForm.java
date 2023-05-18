package com.testexbrain.api.controller.form;

import com.testexbrain.api.model.Venda;
import com.testexbrain.api.repository.VendaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendaForm {

    private double valor;
    private Long idVendedor;
    private String nomeVendedor;

    public Venda converter(VendaRepository vendaRepository) {
        Optional<Venda> venda = vendaRepository.findById(idVendedor);
        return new Venda(idVendedor);
    }
}

package com.testexbrain.api.controller.form;

import com.testexbrain.api.model.Venda;
import com.testexbrain.api.model.Vendedor;
import com.testexbrain.api.repository.VendedorRepository;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendaForm {

    @NotNull
    private double valor;
    @NotNull @Min(value = 1)
    private Long idVendedor;

    public Venda converter(VendedorRepository vendedorRepository) {
        Optional<Vendedor> vendedorOptional = vendedorRepository.findById(idVendedor);
        Vendedor vendedor = vendedorOptional.get();
        return new Venda(valor, vendedor);
    }
}

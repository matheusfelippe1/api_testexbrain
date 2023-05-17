package com.testexbrain.api.form;

import com.testexbrain.api.model.Vendedor;
import com.testexbrain.api.repository.VendedorRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendedorForm {

    private String nome;

    public Vendedor converter(VendedorRepository vendedorRepository) {
        List<Vendedor> vendedor = vendedorRepository.findByNome(nome);
        return new Vendedor(nome);
    }
}
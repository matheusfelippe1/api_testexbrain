package com.testexbrain.api.form;

import com.testexbrain.api.model.Vendedor;
import com.testexbrain.api.repository.VendedorRepository;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendedorForm {

    @NotNull @NotEmpty @Length(min = 5)
    private String nome;

    public Vendedor converter(VendedorRepository vendedorRepository) {
        List<Vendedor> vendedor = vendedorRepository.findByNome(nome);
        return new Vendedor(nome);
    }
}
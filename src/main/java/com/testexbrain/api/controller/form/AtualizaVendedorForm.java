package com.testexbrain.api.controller.form;

import com.testexbrain.api.model.Vendedor;
import com.testexbrain.api.repository.VendedorRepository;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public class AtualizaVendedorForm {

    @NotEmpty @Length(min = 5)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vendedor atualizar(Long id, VendedorRepository repository) {
        Vendedor vendedor = repository.getReferenceById(id);

        vendedor.setNome(this.nome);

        return vendedor;
    }

}

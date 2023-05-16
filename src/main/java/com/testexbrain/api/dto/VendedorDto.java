package com.testexbrain.api.dto;

import com.testexbrain.api.model.Vendedor;

import java.util.List;
import java.util.stream.Collectors;

public class VendedorDto {

    private Long id;
    private String nome;

    public VendedorDto(Vendedor vendedor){
        this.id = vendedor.getId();
        this.nome = vendedor.getNome();
    }

    public static List<VendedorDto> converter(List<Vendedor> vendedores) {
        return vendedores.stream().map(VendedorDto::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

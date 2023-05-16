package com.testexbrain.api.controller;

import com.testexbrain.api.dto.VendedorDto;
import com.testexbrain.api.form.VendedorForm;
import com.testexbrain.api.model.Vendedor;
import com.testexbrain.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    @Autowired
    private VendedorRepository vendedorRepository;

    @GetMapping
    public List<VendedorDto> lista(String nomeVendedor){
        if (nomeVendedor == null){
            List<Vendedor> vendedores = vendedorRepository.findAll();
            return VendedorDto.converter(vendedores);
        } else {
            List<Vendedor> vendedores = vendedorRepository.findByNome(nomeVendedor);
            return VendedorDto.converter(vendedores);
        }
    }

    @PostMapping
    public void cadastrar(@RequestBody VendedorForm form){
    }

}

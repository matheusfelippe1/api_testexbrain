package com.testexbrain.api.controller;

import com.testexbrain.api.dto.VendedorDto;
import com.testexbrain.api.model.Vendedor;
import com.testexbrain.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendedorController {

    @Autowired
    private VendedorRepository vendedorRepository;

    @RequestMapping("/vendedores")
    @ResponseBody
    public List<VendedorDto> lista(String nomeVendedor){
        if (nomeVendedor == null){
            List<Vendedor> vendedores = vendedorRepository.findAll();
            return VendedorDto.converter(vendedores);
        } else {
            List<Vendedor> vendedores = vendedorRepository.findAll();
            return VendedorDto.converter(vendedores);
        }
    }

}

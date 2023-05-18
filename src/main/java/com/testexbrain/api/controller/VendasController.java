package com.testexbrain.api.controller;

import com.testexbrain.api.controller.dto.VendaDto;
import com.testexbrain.api.model.Venda;
import com.testexbrain.api.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendasController {

    @Autowired
    private VendaRepository vendaRepository;

    @RequestMapping("/vendas")
    public List<VendaDto> lista(String nomeCurso) {
        System.out.println(nomeCurso);
        List<Venda> vendas = vendaRepository.findAll();
              return VendaDto.converter(vendas);
    }

}

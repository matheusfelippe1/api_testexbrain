package com.testexbrain.api.controller;

import com.testexbrain.api.controller.dto.VendaDto;
import com.testexbrain.api.model.Venda;
import com.testexbrain.api.model.Vendedor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class VendasController {

    @RequestMapping("/vendas")
    //@ResponseBody
    public List<VendaDto> lista() {
        Venda venda = new Venda("Nome", "Matheus", new Vendedor("String", "Programação"));

       //return Arrays.asList(venda, venda, venda);
        return VendaDto.converter(Arrays.asList(venda, venda, venda));
    }
}

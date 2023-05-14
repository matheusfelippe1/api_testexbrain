package com.testexbrain.api.controller;

import com.testexbrain.api.model.Venda;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class VendasController {

    @RequestMapping("/vendas")
    public List<Venda> lista() {

        return Arrays.asList();
    }
}

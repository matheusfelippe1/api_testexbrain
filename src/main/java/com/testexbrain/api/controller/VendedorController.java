package com.testexbrain.api.controller;

import com.testexbrain.api.model.Vendedor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class VendedorController {

    @RequestMapping("/vendedores")
    @ResponseBody
    public List<Vendedor> lista(){
        Vendedor vendedor = new Vendedor("String nome");
        return Arrays.asList(vendedor, vendedor, vendedor);
    }

}

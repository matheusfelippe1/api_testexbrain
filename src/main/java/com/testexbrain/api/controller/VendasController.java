package com.testexbrain.api.controller;

import com.testexbrain.api.controller.dto.VendaDto;
import com.testexbrain.api.controller.form.VendaForm;
import com.testexbrain.api.model.Venda;
import com.testexbrain.api.repository.VendaRepository;
import com.testexbrain.api.repository.VendedorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private VendedorRepository vendedorRepository;

    @GetMapping
    public List<VendaDto> lista(Long id){
        if (id == null){
            List<Venda> vendas = vendaRepository.findAll();
            return VendaDto.converter(vendas);
        } else {
            List<Venda> vendas = vendaRepository.findByVendedorId(id);
            return VendaDto.converter(vendas);
        }
    }

    @PostMapping
    public ResponseEntity<VendaDto> cadastrar(@RequestBody @Valid VendaForm form, UriComponentsBuilder uriBuilder){
        Venda venda = form.converter(vendaRepository);
        vendaRepository.save(venda);

        URI uri = uriBuilder.path("/vendas/{id}").buildAndExpand(venda.getId()).toUri();
        return ResponseEntity.created(uri).body(new VendaDto(venda));
    }

    @GetMapping("/{id}")
    public VendaDto detalhar(@PathVariable Long id){
        Venda venda = vendaRepository.getReferenceById(id);
        return new VendaDto(venda);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        Venda venda = vendaRepository.getReferenceById(id);
        vendaRepository.delete(venda);
    }

    @PutMapping("/{id}")
    @Transactional
    public VendaDto alterar(@PathVariable Long id, @RequestBody @Valid VendaForm form){
        Venda venda = vendaRepository.getReferenceById(id);
        venda.setId(form.getIdVendedor());
        vendaRepository.save(venda);
        return new VendaDto(venda);
    }

}

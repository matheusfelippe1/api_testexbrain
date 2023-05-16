//package com.testexbrain.api.controller.dto;
//
//import com.testexbrain.api.model.Venda;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class VendaDto {
//
//    private Long id;
//    private LocalDateTime dataVenda;
//    private Double valor;
//    private Long idVendedor;
//    private String nomeVendedor;
//
//    public VendaDto(Venda venda) {
//        this.id = venda.getId();
//        this.dataVenda = venda.getDataVenda();
//        this.valor = venda.getValor();
//        this.idVendedor = venda.getVendedor().getId();
//        this.nomeVendedor = venda.getVendedor().getNome();
//
//    }
//    public static List<VendaDto> converter(List<Venda> vendas) {
//        return vendas.stream().map(VendaDto::new).collect(Collectors.toList());
//    }
//
//    public Long getId() {
//        return id;
//    }
//    public Double getValor() {
//        return valor;
//    }
//    public Long getIdVendedor() {
//        return idVendedor;
//    }
//    public String getNomeVendedor() {
//        return nomeVendedor;
//    }
//    public LocalDateTime getDataVenda() {
//        return dataVenda;
//    }
//
//}

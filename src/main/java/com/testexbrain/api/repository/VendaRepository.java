package com.testexbrain.api.repository;

import com.testexbrain.api.model.Venda;
import com.testexbrain.api.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

    List<Venda> findByVendedorId(Long id);
    Vendedor findByVendedorNome(String nome);
}

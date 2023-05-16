package com.testexbrain.api.repository;

import com.testexbrain.api.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

    List<Vendedor> findByNome(String nomeVendedor);
}
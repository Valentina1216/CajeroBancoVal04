package com.mibancoVal.MiCajeroVal.repository;

import java.util.Optional;

import com.mibancoVal.MiCajeroVal.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByIdentificacion(String identificacion);
    

}

package com.mibancoVal.MiCajeroVal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibancoVal.MiCajeroVal.entity.Cliente;
import com.mibancoVal.MiCajeroVal.entity.Cuenta;
import java.util.Optional;
import java.util.List;

public interface CuentaRepository extends JpaRepository<Cuenta , Long> {
    Optional<Cuenta> findByNumero(String numero);
    List<Cuenta> findByCliente(Cliente cliente);

}
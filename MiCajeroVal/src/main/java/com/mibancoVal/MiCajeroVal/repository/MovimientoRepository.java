package com.mibancoVal.MiCajeroVal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.mibancoVal.MiCajeroVal.entity.Cuenta;
import com.mibancoVal.MiCajeroVal.entity.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
   List<Movimiento> findByCuenta(Cuenta cuenta);
   List<Movimiento> findByCuentaOrderByFechaDesc(Cuenta cuenta);

}
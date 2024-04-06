package com.SYS_STORAGE.main.repositories;

import com.SYS_STORAGE.main.entities.Producto_alarma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IA_ProductoRepository extends JpaRepository<Producto_alarma,Integer> {
}

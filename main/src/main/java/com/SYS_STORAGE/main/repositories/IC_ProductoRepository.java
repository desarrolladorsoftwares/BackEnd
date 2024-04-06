package com.SYS_STORAGE.main.repositories;

import com.SYS_STORAGE.main.entities.Categoria_producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IC_ProductoRepository extends JpaRepository<Categoria_producto,Integer> {
}

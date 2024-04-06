package com.SYS_STORAGE.main.repositories;

import com.SYS_STORAGE.main.entities.Limite_producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IL_ProductoRepository extends JpaRepository<Limite_producto,Integer> {
}

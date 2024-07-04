package com.Insumo.main.repositories;

import com.Insumo.main.entities.Categoria_insumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IC_InsumoRepository extends JpaRepository<Categoria_insumo,Integer> {
}

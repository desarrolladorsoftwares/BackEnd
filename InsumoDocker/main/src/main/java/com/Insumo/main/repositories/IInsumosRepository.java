package com.Insumo.main.repositories;

import com.Insumo.main.entities.Insumos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInsumosRepository extends JpaRepository<Insumos,Integer> {
}

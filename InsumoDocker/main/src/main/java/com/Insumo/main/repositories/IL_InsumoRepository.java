package com.Insumo.main.repositories;

import com.Insumo.main.entities.Limite_insumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IL_InsumoRepository extends JpaRepository<Limite_insumo,Integer> {
    Limite_insumo findByInsumoId(int insumoId);
}

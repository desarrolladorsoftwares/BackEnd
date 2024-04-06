package com.SYS_STORAGE.main.repositories;

import com.SYS_STORAGE.main.entities.Limite_insumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IL_InsumoRepository extends JpaRepository<Limite_insumo,Integer> {
}

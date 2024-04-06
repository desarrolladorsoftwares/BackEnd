package com.SYS_STORAGE.main.repositories;

import com.SYS_STORAGE.main.entities.Insumo_alarma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IA_InsumoRepository extends JpaRepository<Insumo_alarma,Integer> {
}

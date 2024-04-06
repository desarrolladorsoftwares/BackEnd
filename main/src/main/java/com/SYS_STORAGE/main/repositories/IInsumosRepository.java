package com.SYS_STORAGE.main.repositories;

import com.SYS_STORAGE.main.entities.Insumos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInsumosRepository extends JpaRepository<Insumos,Integer>{
}

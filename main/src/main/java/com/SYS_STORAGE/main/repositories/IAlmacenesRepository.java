package com.SYS_STORAGE.main.repositories;

import com.SYS_STORAGE.main.entities.Almacenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlmacenesRepository extends JpaRepository<Almacenes,Integer> {
}

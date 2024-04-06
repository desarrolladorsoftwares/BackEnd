package com.SYS_STORAGE.main.repositories;

import com.SYS_STORAGE.main.entities.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProveedoresRepository extends JpaRepository<Proveedores,Integer> {
}

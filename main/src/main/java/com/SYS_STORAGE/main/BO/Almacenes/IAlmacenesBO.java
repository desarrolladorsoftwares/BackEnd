package com.SYS_STORAGE.main.BO.Almacenes;

import com.SYS_STORAGE.main.entities.Almacenes;

import java.util.List;
import java.util.Optional;

public interface IAlmacenesBO {

    Almacenes save(Almacenes almacen);
    List<Almacenes> findAll();
    Almacenes update(Almacenes almacen);
    Optional<Almacenes> findById(int id);
    void delete(int id);
}

package com.SYS_STORAGE.main.BO.Insumos;

import com.SYS_STORAGE.main.entities.Insumos;

import java.util.List;
import java.util.Optional;

public interface IInsumosBO {

    Insumos save(Insumos insumo);
    List<Insumos> findAll();
    Insumos update(Insumos insumo);
    Optional<Insumos> findById(int id);
    void delete(int id);
}

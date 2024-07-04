package com.Insumo.main.services.Insumos;

import com.Insumo.main.entities.Insumos;

import java.util.List;
import java.util.Optional;

public interface IInsumoService {
    Insumos save(Insumos insumo);
    List<Insumos> findAll();
    Insumos update(Insumos insumo);
    Optional<Insumos> findById(int id);
    void delete(int id);
}

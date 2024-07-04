package com.Insumo.main.services.Limite;

import com.Insumo.main.entities.Limite_insumo;

import java.util.List;
import java.util.Optional;

public interface ILimiteService {

    Limite_insumo save(Limite_insumo limite);
    List<Limite_insumo> findAll();
    Limite_insumo update(Limite_insumo limite);
    Optional<Limite_insumo> findById(int id);
    Limite_insumo findByInsumoId(int insumoId);
    void delete(int id);
}

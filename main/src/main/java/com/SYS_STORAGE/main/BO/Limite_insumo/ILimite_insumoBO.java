package com.SYS_STORAGE.main.BO.Limite_insumo;


import com.SYS_STORAGE.main.entities.Limite_insumo;

import java.util.List;
import java.util.Optional;

public interface ILimite_insumoBO {
    Limite_insumo save(Limite_insumo limite);
    List<Limite_insumo> findAll();
    Limite_insumo update(Limite_insumo limite);
    Optional<Limite_insumo> findById(int id);
    void delete(int id);
}

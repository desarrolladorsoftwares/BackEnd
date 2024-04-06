package com.SYS_STORAGE.main.BO.Categoria_insumo;


import com.SYS_STORAGE.main.entities.Categoria_insumo;

import java.util.List;
import java.util.Optional;

public interface ICategoria_insumoBO {

    Categoria_insumo save(Categoria_insumo categoria);
    List<Categoria_insumo> finndAll();
    Categoria_insumo update(Categoria_insumo categoria);
    Optional<Categoria_insumo> findById(int id);
    void delete(int id);
}

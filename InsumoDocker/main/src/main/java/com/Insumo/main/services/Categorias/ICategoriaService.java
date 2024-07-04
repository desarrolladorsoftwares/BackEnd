package com.Insumo.main.services.Categorias;

import com.Insumo.main.entities.Categoria_insumo;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {

    Categoria_insumo save(Categoria_insumo categoria);
    List<Categoria_insumo> finndAll();
    Categoria_insumo update(Categoria_insumo categoria);
    Optional<Categoria_insumo> findById(int id);
    void delete(int id);
}

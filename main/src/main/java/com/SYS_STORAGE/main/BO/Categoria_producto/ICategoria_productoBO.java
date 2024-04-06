package com.SYS_STORAGE.main.BO.Categoria_producto;


import com.SYS_STORAGE.main.entities.Categoria_producto;

import java.util.List;
import java.util.Optional;

public interface ICategoria_productoBO {

    Categoria_producto save(Categoria_producto categoria);
    List<Categoria_producto> finndAll();
    Categoria_producto update(Categoria_producto categoria);
    Optional<Categoria_producto> findById(int id);
    void delete(int id);
}

package com.SYS_STORAGE.main.BO.Limite_producto;


import com.SYS_STORAGE.main.entities.Limite_producto;

import java.util.List;
import java.util.Optional;

public interface ILimite_productoBO {

    Limite_producto save(Limite_producto limite);
    List<Limite_producto> finndAll();
    Limite_producto update(Limite_producto limite);
    Optional<Limite_producto> findById(int id);
    void delete(int id);
}

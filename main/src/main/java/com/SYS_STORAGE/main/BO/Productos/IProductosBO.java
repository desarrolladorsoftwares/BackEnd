package com.SYS_STORAGE.main.BO.Productos;
import com.SYS_STORAGE.main.entities.Productos;

import java.util.List;
import java.util.Optional;

public interface IProductosBO {
    Productos save(Productos producto);
    List<Productos> findAll();
    Productos update(Productos producto);
    Optional<Productos> findById(int id);
    void delete(int id);
}

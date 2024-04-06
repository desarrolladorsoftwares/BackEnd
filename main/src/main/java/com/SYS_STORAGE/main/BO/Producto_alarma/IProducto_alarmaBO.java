package com.SYS_STORAGE.main.BO.Producto_alarma;

import com.SYS_STORAGE.main.entities.Insumo_alarma;
import com.SYS_STORAGE.main.entities.Producto_alarma;

import java.util.List;
import java.util.Optional;

public interface IProducto_alarmaBO {

    List<Producto_alarma> finndAll();
    Optional<Producto_alarma> findById(int id);
}

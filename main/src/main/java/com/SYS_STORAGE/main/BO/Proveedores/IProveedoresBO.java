package com.SYS_STORAGE.main.BO.Proveedores;

import com.SYS_STORAGE.main.entities.Proveedores;

import java.util.List;
import java.util.Optional;

public interface IProveedoresBO {

    Proveedores save(Proveedores proveedor);
    List<Proveedores> finndAll();
    Proveedores update(Proveedores proveedor);
    Optional<Proveedores> findById(int id);
    void delete(int id);
}

package com.SYS_STORAGE.main.BO.Insumo_alarma;

import com.SYS_STORAGE.main.entities.Insumo_alarma;
import com.SYS_STORAGE.main.entities.Proveedores;

import java.util.List;
import java.util.Optional;

public interface IInsumo_alarmaBO {

    List<Insumo_alarma> finndAll();
    Optional<Insumo_alarma> findById(int id);


}

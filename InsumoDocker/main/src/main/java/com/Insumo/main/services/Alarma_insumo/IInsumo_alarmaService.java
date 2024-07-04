package com.Insumo.main.services.Alarma_insumo;

import com.Insumo.main.entities.Insumo_alarma;

import java.util.List;
import java.util.Optional;

public interface IInsumo_alarmaService {

    List<Insumo_alarma> finndAll();
    Optional<Insumo_alarma> findById(int id);
}

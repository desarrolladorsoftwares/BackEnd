package com.SYS_STORAGE.main.BO.Insumo_alarma;

import com.SYS_STORAGE.main.entities.Insumo_alarma;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IA_InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Insumo_alarmaBO implements IInsumo_alarmaBO{

    @Autowired
    private IA_InsumoRepository AInsumoRepository;

    @Override
    public List<Insumo_alarma> finndAll() {
        return AInsumoRepository.findAll();
    }

    @Override
    public Optional<Insumo_alarma> findById(int id) {
        return Optional.ofNullable(AInsumoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe la alarma con el id: " + id)));
    }
}

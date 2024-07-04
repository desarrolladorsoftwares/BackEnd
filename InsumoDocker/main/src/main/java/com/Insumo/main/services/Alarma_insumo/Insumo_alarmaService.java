package com.Insumo.main.services.Alarma_insumo;

import com.Insumo.main.entities.Insumo_alarma;
import com.Insumo.main.exceptions.ResourceNotFoundException;
import com.Insumo.main.repositories.IA_InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Insumo_alarmaService implements IInsumo_alarmaService{

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

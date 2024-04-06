package com.SYS_STORAGE.main.BO.Limite_insumo;

import com.SYS_STORAGE.main.entities.Limite_insumo;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IL_InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Limite_insumoBO implements ILimite_insumoBO{

    @Autowired
    private IL_InsumoRepository LInsumoRepository;

    @Override
    public Limite_insumo save(Limite_insumo limite) {
        return LInsumoRepository.save(limite);
    }

    @Override
    public List<Limite_insumo> findAll() {
        return LInsumoRepository.findAll();
    }

    @Override
    public Limite_insumo update(Limite_insumo limite) {
        return LInsumoRepository.save(limite);
    }

    @Override
    public Optional<Limite_insumo> findById(int id) {
        return Optional.ofNullable(LInsumoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el limite con el id: " + id)));
    }

    @Override
    public void delete(int id) {
        LInsumoRepository.deleteById(id);
    }
}

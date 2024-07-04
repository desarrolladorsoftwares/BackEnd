package com.Insumo.main.services.Limite;

import com.Insumo.main.entities.Limite_insumo;
import com.Insumo.main.exceptions.ResourceNotFoundException;
import com.Insumo.main.repositories.IL_InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LimiteService implements ILimiteService{

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
    public Limite_insumo findByInsumoId(int insumoId) {
        return LInsumoRepository.findByInsumoId(insumoId);
    }

    @Override
    public void delete(int id) {
        LInsumoRepository.deleteById(id);
    }
}

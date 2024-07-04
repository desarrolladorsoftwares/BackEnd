package com.Insumo.main.services.Insumos;

import com.Insumo.main.entities.Insumos;
import com.Insumo.main.exceptions.ResourceNotFoundException;
import com.Insumo.main.repositories.IInsumosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsumoService implements IInsumoService {

    @Autowired
    private IInsumosRepository insumosRepository;

    @Override
    public Insumos save(Insumos insumo){
        return insumosRepository.save(insumo);
    }

    @Override
    public List<Insumos> findAll() {
        return insumosRepository.findAll();
    }

    @Override
    public Insumos update(Insumos insumo) {
        return insumosRepository.save(insumo);
    }

    @Override
    public Optional<Insumos> findById(int id) {
        return Optional.ofNullable(insumosRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el producto con el id: " + id)));
    }

    @Override
    public void delete(int id) {
        insumosRepository.deleteById(id);
    }
}

package com.SYS_STORAGE.main.BO.Categoria_insumo;

import com.SYS_STORAGE.main.entities.Categoria_insumo;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IAlmacenesRepository;
import com.SYS_STORAGE.main.repositories.IC_InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Categoria_insumoBO implements ICategoria_insumoBO{

    @Autowired
    private IC_InsumoRepository ICategoriaRepository;

    @Override
    public Categoria_insumo save(Categoria_insumo categoria) {
        return ICategoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria_insumo> finndAll() {
        return ICategoriaRepository.findAll();
    }

    @Override
    public Categoria_insumo update(Categoria_insumo categoria) {
        return ICategoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria_insumo> findById(int id) {
        return Optional.ofNullable(ICategoriaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe la categoria con el id: " + id)));
    }

    @Override
    public void delete(int id) {
        ICategoriaRepository.deleteById(id);
    }
}

package com.SYS_STORAGE.main.BO.Limite_producto;

import com.SYS_STORAGE.main.entities.Limite_producto;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IL_ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Limite_productoBO implements ILimite_productoBO{

    @Autowired
    private IL_ProductoRepository LProductoRepository;

    @Override
    public Limite_producto save(Limite_producto limite) {
        return LProductoRepository.save(limite);
    }

    @Override
    public List<Limite_producto> finndAll() {
        return LProductoRepository.findAll();
    }

    @Override
    public Limite_producto update(Limite_producto limite) {
        return LProductoRepository.save(limite);
    }

    @Override
    public Optional<Limite_producto> findById(int id) {
        return Optional.ofNullable(LProductoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el limite con el id: " + id)));
    }

    @Override
    public void delete(int id) {
        LProductoRepository.deleteById(id);
    }
}

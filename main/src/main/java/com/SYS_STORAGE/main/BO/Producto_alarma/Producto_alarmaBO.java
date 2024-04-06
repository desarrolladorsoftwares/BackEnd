package com.SYS_STORAGE.main.BO.Producto_alarma;

import com.SYS_STORAGE.main.entities.Producto_alarma;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IA_ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Producto_alarmaBO implements IProducto_alarmaBO{

    @Autowired
    private IA_ProductoRepository AProductoRepository;

    @Override
    public List<Producto_alarma> finndAll() {
        return AProductoRepository.findAll();
    }

    @Override
    public Optional<Producto_alarma> findById(int id) {
        return Optional.ofNullable(AProductoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe la alarma con el id: " + id)));
    }
}

package com.SYS_STORAGE.main.BO.Productos;

import com.SYS_STORAGE.main.entities.Productos;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductosBO implements IProductosBO{

    @Autowired
    private IProductosRepository productosRepository;

    @Override
    public Productos save(Productos producto){
        return productosRepository.save(producto);
    }

    @Override
    public List<Productos> findAll() {
        return productosRepository.findAll();
    }

    @Override
    public Productos update(Productos producto) {
        return productosRepository.save(producto);
    }

    @Override
    public Optional<Productos> findById(int id) {
        return Optional.ofNullable(productosRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el producto con el id: " + id)));
    }

    @Override
    public void delete(int id) {
        productosRepository.deleteById(id);
    }
}

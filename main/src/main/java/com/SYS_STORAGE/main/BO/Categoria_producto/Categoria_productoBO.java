package com.SYS_STORAGE.main.BO.Categoria_producto;

import com.SYS_STORAGE.main.entities.Categoria_producto;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IC_ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Categoria_productoBO implements ICategoria_productoBO{

    @Autowired
    private IC_ProductoRepository IProductoRepository;

    @Override
    public Categoria_producto save(Categoria_producto categoria) {
        return IProductoRepository.save(categoria);
    }

    @Override
    public List<Categoria_producto> finndAll() {
        return IProductoRepository.findAll();
    }

    @Override
    public Categoria_producto update(Categoria_producto categoria) {
        return IProductoRepository.save(categoria);
    }

    @Override
    public Optional<Categoria_producto> findById(int id) {
        return Optional.ofNullable(IProductoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe la categoria con el id: " + id)));
    }

    @Override
    public void delete(int id) {
        IProductoRepository.deleteById(id);
    }
}

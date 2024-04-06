package com.SYS_STORAGE.main.BO.Proveedores;

import com.SYS_STORAGE.main.entities.Proveedores;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProveedoresBO implements IProveedoresBO{

    @Autowired
    private IProveedoresRepository proveedoresRepository;

    @Override
    public Proveedores save(Proveedores proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    @Override
    public List<Proveedores> finndAll() {
        return proveedoresRepository.findAll();
    }

    @Override
    public Proveedores update(Proveedores proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    @Override
    public Optional<Proveedores> findById(int id) {
        return Optional.ofNullable(proveedoresRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el proveedor con el id: " + id)));
    }

    @Override
    public void delete(int id) {
        proveedoresRepository.deleteById(id);
    }
}

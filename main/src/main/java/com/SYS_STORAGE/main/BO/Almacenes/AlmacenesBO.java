package com.SYS_STORAGE.main.BO.Almacenes;

import com.SYS_STORAGE.main.entities.Almacenes;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IAlmacenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AlmacenesBO implements IAlmacenesBO{

    @Autowired
    private IAlmacenesRepository almacenesRepository;

    @Override
    public Almacenes save(Almacenes almacen){
        return almacenesRepository.save(almacen);
    }

    @Override
    public List<Almacenes> findAll() {
        return almacenesRepository.findAll();
    }

    @Override
    public Almacenes update(Almacenes almacen) {
        return almacenesRepository.save(almacen);
    }

    @Override
    public Optional<Almacenes> findById(int id) {
        return Optional.ofNullable(almacenesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el almacen con el id: " + id)));
    }

    @Override
    public void delete(int id) {
        almacenesRepository.deleteById(id);
    }
}

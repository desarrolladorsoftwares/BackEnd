package com.SYS_STORAGE.main.BO.Personal;

import com.SYS_STORAGE.main.entities.Personal;
import com.SYS_STORAGE.main.exceptions.ResourceNotFoundException;
import com.SYS_STORAGE.main.repositories.IPersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonalBO implements IPersonalBO{

    @Autowired
    private IPersonalRepository personalRepository;

    @Override
    public Personal save(Personal personal) {
        return personalRepository.save(personal);
    }

    @Override
    public List<Personal> finndAll() {
        return personalRepository.findAll();
    }

    @Override
    public Personal update(Personal personal) {
        return personalRepository.save(personal);
    }

    @Override
    public Optional<Personal> findById(int id) {
        return Optional.ofNullable(personalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el personal con el id: " + id)));
    }

    @Override
    public void delete(int id) {
        personalRepository.deleteById(id);
    }
}

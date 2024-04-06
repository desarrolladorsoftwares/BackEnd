package com.SYS_STORAGE.main.BO.Personal;


import com.SYS_STORAGE.main.entities.Personal;

import java.util.List;
import java.util.Optional;

public interface IPersonalBO {

    Personal save(Personal personal);
    List<Personal> finndAll();
    Personal update(Personal personal);
    Optional<Personal> findById(int id);
    void delete(int id);
}

package com.SYS_STORAGE.main.BO.Usuario;


import com.SYS_STORAGE.main.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioBO {
    Usuario save(Usuario usuario);
    List<Usuario> finndAll();
    Usuario update(Usuario usuario);
    Optional<Usuario> findById(int id);
    void delete(int id);
}

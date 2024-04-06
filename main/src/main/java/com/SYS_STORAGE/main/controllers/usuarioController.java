package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Usuario.UsuarioBO;
import com.SYS_STORAGE.main.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class usuarioController {

    @Autowired
    private UsuarioBO usuarioBO;

    @GetMapping
    public List<Usuario> findAll(){
        return (ArrayList<Usuario>) usuarioBO.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Usuario>> findById(@PathVariable int id){
        Optional<Usuario> usuario = usuarioBO.findById(id);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/save")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioBO.save(usuario);
    }

    @PutMapping("/update/{id}")
    public Usuario update (@RequestBody Usuario usuario){
        return usuarioBO.update(usuario);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        usuarioBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

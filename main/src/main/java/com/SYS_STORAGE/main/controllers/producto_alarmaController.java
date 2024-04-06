package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Insumo_alarma.Insumo_alarmaBO;
import com.SYS_STORAGE.main.BO.Producto_alarma.Producto_alarmaBO;
import com.SYS_STORAGE.main.entities.Insumo_alarma;
import com.SYS_STORAGE.main.entities.Producto_alarma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alarma-producto")
@CrossOrigin(origins = "*")
public class producto_alarmaController {

    @Autowired
    private Producto_alarmaBO productoAlarmaBO;

    @GetMapping
    public List<Producto_alarma> findAll(){
        return (ArrayList<Producto_alarma>) productoAlarmaBO.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Producto_alarma>> findById(@PathVariable int id){
        Optional<Producto_alarma> alarma = productoAlarmaBO.findById(id);
        return ResponseEntity.ok(alarma);
    }
}

package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Insumo_alarma.Insumo_alarmaBO;
import com.SYS_STORAGE.main.entities.Insumo_alarma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alarma-insumo")
@CrossOrigin(origins = "*")
public class insumo_alarmaController {

    @Autowired
    private Insumo_alarmaBO insumoAlarmaBO;

    @GetMapping
    public List<Insumo_alarma> findAll(){
        return (ArrayList<Insumo_alarma>) insumoAlarmaBO.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Insumo_alarma>> findById(@PathVariable int id){
        Optional<Insumo_alarma> alarma = insumoAlarmaBO.findById(id);
        return ResponseEntity.ok(alarma);
    }
}

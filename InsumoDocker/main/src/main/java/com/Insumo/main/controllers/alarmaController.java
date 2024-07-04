package com.Insumo.main.controllers;

import com.Insumo.main.entities.Insumo_alarma;
import com.Insumo.main.services.Alarma_insumo.Insumo_alarmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alarma-insumo")
@CrossOrigin(origins = "*")
public class alarmaController {

    @Autowired
    private Insumo_alarmaService insumoAlarmaService;

    @GetMapping
    public List<Insumo_alarma> findAll(){
        return (ArrayList<Insumo_alarma>) insumoAlarmaService.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Insumo_alarma>> findById(@PathVariable int id){
        Optional<Insumo_alarma> alarma = insumoAlarmaService.findById(id);
        return ResponseEntity.ok(alarma);
    }


}

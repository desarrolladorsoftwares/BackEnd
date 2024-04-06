package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Limite_insumo.Limite_insumoBO;
import com.SYS_STORAGE.main.entities.Limite_insumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/limite-insumo")
@CrossOrigin(origins = "*")
public class limite_insumoController {

    @Autowired
    private Limite_insumoBO limiteInsumoBO;

    @GetMapping
    public List<Limite_insumo> findAll(){
        return (ArrayList<Limite_insumo>) limiteInsumoBO.findAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Limite_insumo>> findById(@PathVariable int id){
        Optional<Limite_insumo> limite = limiteInsumoBO.findById(id);
        return ResponseEntity.ok(limite);
    }

    @PostMapping("/save")
    public Limite_insumo save(@RequestBody Limite_insumo limite){
        return limiteInsumoBO.save(limite);
    }

    @PutMapping("/update/{id}")
    public Limite_insumo update (@RequestBody Limite_insumo limite){
        return limiteInsumoBO.update(limite);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        limiteInsumoBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

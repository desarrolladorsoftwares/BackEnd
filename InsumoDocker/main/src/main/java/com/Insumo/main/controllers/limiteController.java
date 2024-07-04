package com.Insumo.main.controllers;

import com.Insumo.main.entities.Limite_insumo;
import com.Insumo.main.services.Limite.LimiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/limite-insumo")
@CrossOrigin(origins = "*")
public class limiteController {

    @Autowired
    private LimiteService limiteService;

    @GetMapping
    public List<Limite_insumo> findAll(){
        return (ArrayList<Limite_insumo>) limiteService.findAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Limite_insumo>> findById(@PathVariable int id){
        Optional<Limite_insumo> limite = limiteService.findById(id);
        return ResponseEntity.ok(limite);
    }

    @GetMapping("/findByInsumoId/{insumoId}")
    public ResponseEntity<Limite_insumo> findByInsumoId(@PathVariable int insumoId){
        Limite_insumo limite = limiteService.findByInsumoId(insumoId);
        return ResponseEntity.ok(limite);
    }

    @PostMapping("/save")
    public Limite_insumo save(@RequestBody Limite_insumo limite){
        return limiteService.save(limite);
    }

    @PutMapping("/update/{id}")
    public Limite_insumo update (@RequestBody Limite_insumo limite){
        return limiteService.update(limite);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        limiteService.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

package com.SYS_STORAGE.main.controllers;


import com.SYS_STORAGE.main.BO.Categoria_insumo.Categoria_insumoBO;
import com.SYS_STORAGE.main.entities.Categoria_insumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/categoria-insumo")
@CrossOrigin(origins = "*")
public class categoria_insumoController {

    @Autowired
    private Categoria_insumoBO categoriaInsumoBO;

    @GetMapping
    public List<Categoria_insumo> findAll(){
        return (ArrayList<Categoria_insumo>) categoriaInsumoBO.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Categoria_insumo>> findById(@PathVariable int id){
        Optional<Categoria_insumo> categoria = categoriaInsumoBO.findById(id);
        return ResponseEntity.ok(categoria);
    }

    @PostMapping("/save")
    public Categoria_insumo save(@RequestBody Categoria_insumo categoria){
        return categoriaInsumoBO.save(categoria);
    }

    @PutMapping("/update/{id}")
    public Categoria_insumo update (@RequestBody Categoria_insumo categoria){
        return categoriaInsumoBO.update(categoria);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        categoriaInsumoBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

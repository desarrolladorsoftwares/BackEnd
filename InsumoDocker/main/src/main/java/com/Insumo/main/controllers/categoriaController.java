package com.Insumo.main.controllers;

import com.Insumo.main.entities.Categoria_insumo;
import com.Insumo.main.services.Categorias.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/categoria-insumo")
@CrossOrigin(origins = "*")
public class categoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria_insumo> findAll(){
        return (ArrayList<Categoria_insumo>) categoriaService.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Categoria_insumo>> findById(@PathVariable int id){
        Optional<Categoria_insumo> categoria = categoriaService.findById(id);
        return ResponseEntity.ok(categoria);
    }

    @PostMapping("/save")
    public Categoria_insumo save(@RequestBody Categoria_insumo categoria){
        return categoriaService.save(categoria);
    }

    @PutMapping("/update/{id}")
    public Categoria_insumo update (@RequestBody Categoria_insumo categoria){
        return categoriaService.update(categoria);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        categoriaService.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

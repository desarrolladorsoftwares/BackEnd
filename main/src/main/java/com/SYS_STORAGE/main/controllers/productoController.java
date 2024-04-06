package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Productos.ProductosBO;
import com.SYS_STORAGE.main.entities.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins = "*")
public class productoController {

    @Autowired
    private ProductosBO productoBO;

    @GetMapping
    public List<Productos> findAll(){
        return (ArrayList<Productos>) productoBO.findAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Productos>> findById(@PathVariable int id){
        Optional<Productos> producto = productoBO.findById(id);
        return ResponseEntity.ok(producto);
    }

    @PostMapping("/save")
    public Productos save(@RequestBody Productos producto){
        return productoBO.save(producto);
    }

    @PutMapping("/update/{id}")
    public Productos update (@RequestBody Productos producto){
        return productoBO.update(producto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        productoBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }

}

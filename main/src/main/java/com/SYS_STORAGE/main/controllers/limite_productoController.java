package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Limite_producto.Limite_productoBO;
import com.SYS_STORAGE.main.entities.Limite_producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/limite-producto")
@CrossOrigin(origins = "*")
public class limite_productoController {

    @Autowired
    private Limite_productoBO limiteProductoBO;

    @GetMapping
    public List<Limite_producto> findAll(){
        return (ArrayList<Limite_producto>) limiteProductoBO.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Limite_producto>> findById(@PathVariable int id){
        Optional<Limite_producto> limite = limiteProductoBO.findById(id);
        return ResponseEntity.ok(limite);
    }

    @PostMapping("/save")
    public Limite_producto save(@RequestBody Limite_producto limite){
        return limiteProductoBO.save(limite);
    }

    @PutMapping("/update/{id}")
    public Limite_producto update (@RequestBody Limite_producto limite){
        return limiteProductoBO.update(limite);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        limiteProductoBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

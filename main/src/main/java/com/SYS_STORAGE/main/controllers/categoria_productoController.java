package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Categoria_producto.Categoria_productoBO;
import com.SYS_STORAGE.main.entities.Categoria_producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/categoria-producto")
@CrossOrigin(origins = "*")
public class categoria_productoController {

    @Autowired
    private Categoria_productoBO categoriaProductoBO;

    @GetMapping
    public List<Categoria_producto> findAll(){
        return (ArrayList<Categoria_producto>) categoriaProductoBO.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Categoria_producto>> findById(@PathVariable int id){
        Optional<Categoria_producto> categoria = categoriaProductoBO.findById(id);
        return ResponseEntity.ok(categoria);
    }

    @PostMapping("/save")
    public Categoria_producto save(@RequestBody Categoria_producto categoria){
        return categoriaProductoBO.save(categoria);
    }

    @PutMapping("/update/{id}")
    public Categoria_producto update (@RequestBody Categoria_producto categoria){
        return categoriaProductoBO.update(categoria);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        categoriaProductoBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

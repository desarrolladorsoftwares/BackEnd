package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Almacenes.AlmacenesBO;
import com.SYS_STORAGE.main.entities.Almacenes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/almacen")
@CrossOrigin(origins = "*")
public class almacenesController {

    @Autowired
    private AlmacenesBO almacenesBO;

    @GetMapping
    public List<Almacenes> findAll(){
        return (ArrayList<Almacenes>) almacenesBO.findAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Almacenes>> findById(@PathVariable int id){
        Optional<Almacenes> almacen = almacenesBO.findById(id);
        return ResponseEntity.ok(almacen);
    }

    @PostMapping("/save")
    public Almacenes save(@RequestBody Almacenes almacen){
        return almacenesBO.save(almacen);
    }

    @PutMapping("/update/{id}")
    public Almacenes update (@RequestBody Almacenes almacen){
        return almacenesBO.update(almacen);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        almacenesBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

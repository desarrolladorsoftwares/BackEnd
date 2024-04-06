package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Insumos.InsumosBO;
import com.SYS_STORAGE.main.entities.Insumos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/insumo")
@CrossOrigin(origins = "*")
public class insumoController {

    @Autowired
    private InsumosBO insumoBO;

    @GetMapping
    public List<Insumos> findAll(){
        return (ArrayList<Insumos>) insumoBO.findAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Insumos>> findById(@PathVariable int id){
        Optional<Insumos> insumo = insumoBO.findById(id);
        return ResponseEntity.ok(insumo);
    }

    @PostMapping("/save")
    public Insumos save(@RequestBody Insumos insumo){
        return insumoBO.save(insumo);
    }

    @PutMapping("/update/{id}")
    public Insumos update (@RequestBody Insumos insumo){
        return insumoBO.update(insumo);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        insumoBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

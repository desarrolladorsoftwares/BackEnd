package com.Insumo.main.controllers;

import com.Insumo.main.entities.Insumos;
import com.Insumo.main.services.Insumos.InsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/insumo")
@CrossOrigin(origins = "*")
public class insumoController {

    @Autowired
    private InsumoService insumoService;

    @GetMapping
    public List<Insumos> findAll(){
        return (ArrayList<Insumos>) insumoService.findAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Insumos>> findById(@PathVariable int id){
        Optional<Insumos> insumo = insumoService.findById(id);
        return ResponseEntity.ok(insumo);
    }

    @PostMapping("/save")
    public Insumos save(@RequestBody Insumos insumo){
        return insumoService.save(insumo);
    }

    @PutMapping("/update/{id}")
    public Insumos update (@RequestBody Insumos insumo){
        return insumoService.update(insumo);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        insumoService.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

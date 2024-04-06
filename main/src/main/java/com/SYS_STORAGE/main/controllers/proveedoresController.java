package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Proveedores.ProveedoresBO;
import com.SYS_STORAGE.main.entities.Proveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/proveedores")
@CrossOrigin(origins = "*")
public class proveedoresController {

    @Autowired
    private ProveedoresBO proveedoresBO;

    @GetMapping
    public List<Proveedores> findAll(){
        return (ArrayList<Proveedores>) proveedoresBO.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Proveedores>> findById(@PathVariable int id){
        Optional<Proveedores> proveedor = proveedoresBO.findById(id);
        return ResponseEntity.ok(proveedor);
    }

    @PostMapping("/save")
    public Proveedores save(@RequestBody Proveedores proveedor){
        return proveedoresBO.save(proveedor);
    }

    @PutMapping("/update/{id}")
    public Proveedores update (@RequestBody Proveedores proveedor){
        return proveedoresBO.update(proveedor);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        proveedoresBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

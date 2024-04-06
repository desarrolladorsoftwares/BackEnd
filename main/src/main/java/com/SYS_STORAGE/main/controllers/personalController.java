package com.SYS_STORAGE.main.controllers;

import com.SYS_STORAGE.main.BO.Personal.PersonalBO;
import com.SYS_STORAGE.main.entities.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/personal")
@CrossOrigin(origins = "*")
public class personalController {

    @Autowired
    private PersonalBO personalBO;

    @GetMapping
    public List<Personal> findAll(){
        return (ArrayList<Personal>) personalBO.finndAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Personal>> findById(@PathVariable int id){
        Optional<Personal> personal = personalBO.findById(id);
        return ResponseEntity.ok(personal);
    }

    @PostMapping("/save")
    public Personal save(@RequestBody Personal personal){
        return personalBO.save(personal);
    }

    @PutMapping("/update/{id}")
    public Personal update (@RequestBody Personal personal){
        return personalBO.update(personal);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        personalBO.delete(id);

        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}

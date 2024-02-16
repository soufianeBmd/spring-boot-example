package com.soufiane.controller;

import com.soufiane.model.Etude;
import com.soufiane.service.EtudeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etude")
public class EtudeController {
    private final EtudeService etudeService;

    public EtudeController(EtudeService etudeService) {
        this.etudeService = etudeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Etude>> getAllEtude(){
        List<Etude> etudes = etudeService.findAllEtude();
        return new ResponseEntity<>(etudes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Etude> getEmployeeById(@PathVariable("id") Integer id){
        Etude etude = etudeService.findEtude(id);
        return new ResponseEntity<>(etude, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Etude> addEmployee(@RequestBody Etude etude){
        Etude newEtude = etudeService.addEtude(etude);
        return new ResponseEntity<>(newEtude, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Etude> updateEmployee(@RequestBody Etude etude){
        Etude updateEtude = etudeService.updateEtude(etude);
        return new ResponseEntity<>(etude, HttpStatus.OK);
    }
}

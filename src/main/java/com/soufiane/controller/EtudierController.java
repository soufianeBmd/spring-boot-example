package com.soufiane.controller;

import com.soufiane.model.Etudier;
import com.soufiane.service.EtudierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudier")
public class EtudierController {
    private final EtudierService etudierService;

    public EtudierController(EtudierService etudierService) {
        this.etudierService = etudierService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Etudier>> getAllEtudier(){
        List<Etudier> etudiers = etudierService.findAllEtudier();
        return new ResponseEntity<>(etudiers, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Etudier> addEtudier(@RequestBody Etudier etudier){
        Etudier newEtudier = etudierService.addEtudier(etudier);
        return new ResponseEntity<>(newEtudier, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Etudier> updateEtudier(@RequestBody Etudier etudier){
        Etudier updateEtudier = etudierService.updateEtudier(etudier);
        return new ResponseEntity<>(updateEtudier, HttpStatus.OK);
    }
}

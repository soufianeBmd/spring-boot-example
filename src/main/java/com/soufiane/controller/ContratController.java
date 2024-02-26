package com.soufiane.controller;

import com.soufiane.model.Contrat;
import com.soufiane.service.ContratService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrat")
@CrossOrigin(origins = "http://localhost:4200")
public class ContratController {
    private final ContratService contratService;

    public ContratController(ContratService contratService) {
        this.contratService = contratService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Contrat>> getAllContrat(){
        List<Contrat> contrats = contratService.findAllContrat();
        return new ResponseEntity<>(contrats, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Contrat> getContratById(@PathVariable("id") Integer id){
        Contrat contrat = contratService.findContrat(id);
        return new ResponseEntity<>(contrat, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Contrat> addContrat(@RequestBody Contrat contrat){
        Contrat newContrat= contratService.addContrat(contrat);
        return new ResponseEntity<>(newContrat, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Contrat> updateContrat(@RequestBody Contrat contrat){
        Contrat updateContrat= contratService.updateContrat(contrat);
        return new ResponseEntity<>(contrat, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id){
        contratService.deleteContrat(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

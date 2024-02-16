package com.soufiane.service;

import com.soufiane.model.Etudier;
import com.soufiane.repositrory.EtudierRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EtudierService {
    private final EtudierRepository etudierRepository;

    public EtudierService(EtudierRepository etudierRepository) {
        this.etudierRepository = etudierRepository;
    }

    public List<Etudier> findAllEtudier (){
        return etudierRepository.findAll();
    }


    public Etudier addEtudier (Etudier etudier){
        return etudierRepository.save(etudier);
    }

    public Etudier updateEtudier (Etudier etudier){
        return etudierRepository.save(etudier);
    }
}

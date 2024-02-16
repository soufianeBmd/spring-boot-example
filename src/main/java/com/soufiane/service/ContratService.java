package com.soufiane.service;

import com.soufiane.model.Contrat;
import com.soufiane.repositrory.ContratRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ContratService {
    private final ContratRepository contratRepository;

    public ContratService(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    public List<Contrat> findAllContrat (){
        return contratRepository.findAll();
    }

    public Contrat findContrat(Integer id){
        return contratRepository.findContratById(id);
    }

    public Contrat addContrat (Contrat contrat){
        return contratRepository.save(contrat);
    }

    public Contrat updateContrat (Contrat contrat){
        return contratRepository.save(contrat);
    }
}

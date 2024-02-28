package com.soufiane.service;

import com.soufiane.DTO.ContratEmployeeDTO;
import com.soufiane.model.Contrat;
import com.soufiane.repositrory.ContratRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public void deleteContrat(Integer id) {
        contratRepository.deleteContratById(id);
    }

    public List<ContratEmployeeDTO> getNbContratByEmployee(Integer annee){
        List<Object[]> count = contratRepository.countEmployeeByContrat(annee);
        List<ContratEmployeeDTO> resultat = new ArrayList<>();
        for (Object[] row: count){
            ContratEmployeeDTO contratEmployeeDTO = new ContratEmployeeDTO();
            contratEmployeeDTO.setNbEmployee((Long) row[0]);
            contratEmployeeDTO.setType((String) row[1]);
            resultat.add(contratEmployeeDTO);
        }
        return resultat;
    }
}

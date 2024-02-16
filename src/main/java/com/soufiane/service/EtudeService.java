package com.soufiane.service;

import com.soufiane.model.Employee;
import com.soufiane.model.Etude;
import com.soufiane.repositrory.EtudeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EtudeService {
    private final EtudeRepository etudeRepository;

    public EtudeService(EtudeRepository etudeRepository) {
        this.etudeRepository = etudeRepository;
    }

    public List<Etude> findAllEtude (){
        return etudeRepository.findAll();
    }

    public Etude findEtude(Integer id){
        return etudeRepository.findEtudeById(id);
    }

    public Etude addEtude (Etude etude){
        return etudeRepository.save(etude);
    }

    public Etude updateEtude (Etude etude){
        return etudeRepository.save(etude);
    }
}

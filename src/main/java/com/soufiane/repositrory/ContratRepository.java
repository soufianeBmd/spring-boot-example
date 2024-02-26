package com.soufiane.repositrory;

import com.soufiane.model.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {
    Contrat findContratById(Integer id);

    void deleteContratById(Integer id);
}

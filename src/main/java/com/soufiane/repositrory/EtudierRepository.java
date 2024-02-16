package com.soufiane.repositrory;

import com.soufiane.model.Etudier;
import com.soufiane.model.EtudierKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudierRepository extends JpaRepository<Etudier, EtudierKey>{
}

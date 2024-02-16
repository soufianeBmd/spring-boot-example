package com.soufiane.repositrory;

import com.soufiane.model.Etude;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudeRepository extends JpaRepository<Etude, Integer> {
    Etude findEtudeById(Integer id);
}

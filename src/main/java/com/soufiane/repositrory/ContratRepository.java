package com.soufiane.repositrory;

import com.soufiane.model.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {
    Contrat findContratById(Integer id);

    void deleteContratById(Integer id);

    @Query(value = "select count(e.id) as nbEmployee, co.type from employee as e, contrat as co where e.id = co.employee and extract(year from co.date_d) = ?1 group by co.type, extract(year from co.date_d);", nativeQuery = true)
    List<Object[]> countEmployeeByContrat(Integer annee);

    @Query(value = "select e.nom, co.type, co.date_d, co.date_f, case when co.date_f < CURRENT_DATE then co.date_f -co.date_d else CURRENT_DATE - co.date_d END as jours, case when co.date_f < CURRENT_DATE then 'Expired' else 'Unexpired' END as status from employee as e, contrat as co where e.id = co.employee", nativeQuery = true)
    List<Object[]> contractDetails();
}

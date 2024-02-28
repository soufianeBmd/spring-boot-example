package com.soufiane.repositrory;
import com.soufiane.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select e.nom, (po.salaire*12) as salaire_annuelle from employee as e, post as po where po.id = e.id group by e.nom, salaire_annuelle", nativeQuery = true)
    List<Object[]> annualSalary();

}

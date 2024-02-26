package com.soufiane.repositrory;
import com.soufiane.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findEmployeeById(Integer id);
    void deleteEmployeeById(Integer id);

}

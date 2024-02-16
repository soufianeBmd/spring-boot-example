package com.soufiane.service;

import com.soufiane.model.Employee;
import com.soufiane.repositrory.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployee (){
        return employeeRepository.findAll();
    }

    public Employee findEmployee(Integer id){
        return employeeRepository.findEmployeeById(id);
    }

    public Employee addEmployee (Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee (Employee employee){
        return employeeRepository.save(employee);
    }
}

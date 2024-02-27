package com.soufiane.service;

import com.soufiane.DTO.EmployeePostDTO;
import com.soufiane.model.Employee;
import com.soufiane.repositrory.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public Employee findEmployeeById(Integer id){
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee addEmployee (Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee (Employee employee){
        return employeeRepository.save(employee);
    }
    public void deleteEmployee(Integer id){
        if (findEmployeeById(id)!=null) {
            employeeRepository.deleteById(id);
        }
    }

    public List<EmployeePostDTO> getAnnualSalary(){
        List<Object[]> counts = employeeRepository.annualSalary();
        List<EmployeePostDTO> result = new ArrayList<>();
        for (Object[] row: counts){
            EmployeePostDTO employeePostDTO = new EmployeePostDTO();
            employeePostDTO.setNom((String) row[0]);
            employeePostDTO.setSalaireAnnuelle((Integer) row[1]);
            result.add(employeePostDTO);
        }
        return result;
    }

}

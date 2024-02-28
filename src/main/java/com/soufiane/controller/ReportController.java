package com.soufiane.controller;


import com.soufiane.DTO.ContratEmployeeDTO;
import com.soufiane.DTO.EmployeePostDTO;
import com.soufiane.DTO.PosteEmployesDTO;
import com.soufiane.service.ContratService;
import com.soufiane.service.EmployeeService;
import com.soufiane.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dashboard")
@CrossOrigin(origins = "http://localhost:4200")
public class ReportController {
    private final PostService postService;
    private final EmployeeService employeeService;
    private final ContratService contratService;

    public ReportController(PostService postService, EmployeeService employeeService, ContratService contratService) {
        this.postService = postService;
        this.employeeService = employeeService;
        this.contratService = contratService;
    }

    @GetMapping("/employee-par-post")
    public List<PosteEmployesDTO> getEmployeeByPost(){
        return postService.getEmployeeByPost();
    }
    @GetMapping("/salaire-annuelle")
    public List<EmployeePostDTO> getAnnualSalary(){
        return employeeService.getAnnualSalary();
    }
    @GetMapping("/employee-contrat/{annee}")
    public List<ContratEmployeeDTO> getNbEmployeeByContrat(@PathVariable("annee") Integer annee){
        return contratService.getNbContratByEmployee(annee);
    }

}

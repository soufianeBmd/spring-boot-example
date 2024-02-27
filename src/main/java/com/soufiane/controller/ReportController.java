package com.soufiane.controller;


import com.soufiane.DTO.EmployeePostDTO;
import com.soufiane.DTO.PosteEmployesDTO;
import com.soufiane.service.EmployeeService;
import com.soufiane.service.PostService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/dashboard")
@CrossOrigin(origins = "http://localhost:4200")
public class ReportController {
    private final PostService postService;
    private final EmployeeService employeeService;

    public ReportController(PostService postService, EmployeeService employeeService) {
        this.postService = postService;
        this.employeeService = employeeService;
    }

    @GetMapping("/employee-par-post")
    public List<PosteEmployesDTO> getEmployeeByPost(){
        return postService.getEmployeeByPost();
    }
    @GetMapping("/salaire-annuelle")
    public List<EmployeePostDTO> getAnnualSalary(){
        return employeeService.getAnnualSalary();
    }

}

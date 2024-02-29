package com.soufiane.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeContratDTO {
    private String nom;
    private String type;
    private Date date_d;
    private Date date_f;
    private  Integer jours;
    private String status;
}

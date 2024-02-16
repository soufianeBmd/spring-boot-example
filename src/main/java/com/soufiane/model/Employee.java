package com.soufiane.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom", length = 25, nullable = false)
    private String nom;

    @Column(name = "prenom", length = 25, nullable = false)
    private String prenom;

    @Column(name = "sexe", length = 10, nullable = false)
    private String sexe;

    @ManyToOne
    @JoinColumn(name = "post", referencedColumnName = "id")
    private Post post;
}

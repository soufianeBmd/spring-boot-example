package com.soufiane.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "etude")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Etude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "specilite", length = 50, nullable = false)
    private String specialite;

    @Column(name = "diplome", length = 50, nullable = false)
    private String diplome;

    @Column(name = "ecole", length = 50, nullable = false)
    private String ecole;
}

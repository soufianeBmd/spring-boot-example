package com.soufiane.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "etudier")
@IdClass(EtudierKey.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Etudier {
    @Id
    @ManyToOne
    @JoinColumn(name = "employee", referencedColumnName = "id")
    private Employee employee;

    @Id
    @ManyToOne
    @JoinColumn(name = "etude", referencedColumnName = "id")
    private Etude etude;
}

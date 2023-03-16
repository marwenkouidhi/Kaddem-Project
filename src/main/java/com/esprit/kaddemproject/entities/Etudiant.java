package com.esprit.kaddemproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option optionE;


    @OneToMany(mappedBy = "etudiant")
    private List<Contract> contracts;
    @ManyToOne
    private Departement departement;
    @ManyToMany(mappedBy = "etudiants")
    private List<Equipe> equipes;
}

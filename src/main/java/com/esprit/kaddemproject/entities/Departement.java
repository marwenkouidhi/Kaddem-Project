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
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepart;
    private String nomDepart;
    
    @OneToMany(mappedBy = "departement")
    private List<Etudiant> etudiants;

}


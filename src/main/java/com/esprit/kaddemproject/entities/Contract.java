package com.esprit.kaddemproject.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContract;
    private Date dateDebutContract;
    private Date finDebutContract;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;
    @Id
    private Integer montantContract;

    
    @ManyToOne
    private Etudiant etudiant;
}

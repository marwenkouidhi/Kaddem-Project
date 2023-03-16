package com.esprit.kaddemproject.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idContract;
    private Date dateDebutContract;
    private Date finDebutContract;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;
    private Integer montantContract;


    @ManyToOne
    private Etudiant etudiant;
}

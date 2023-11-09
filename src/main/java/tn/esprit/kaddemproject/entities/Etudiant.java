package tn.esprit.kaddemproject.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etudiant implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.PUBLIC)
    private Integer idEtudiant;
    private String nomE;
    private String prenomE;
    @Enumerated(EnumType.STRING)
    private Option optionE;

    @OneToMany(mappedBy="etudiant")
    @JsonIgnore
    private List<Contrat> contrats;

    @ManyToOne
    @JsonIgnore
    private Departement departement;

    @ManyToMany
    private List<Equipe> equipes;

    public Etudiant(String nomE,String prenomE,Option optionE){
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.optionE = optionE;
    }


}

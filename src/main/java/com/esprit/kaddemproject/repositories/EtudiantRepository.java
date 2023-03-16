package com.esprit.kaddemproject.repositories;

import com.esprit.kaddemproject.entities.Etudiant;
import com.esprit.kaddemproject.generics.RepositoryGeneric;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

public interface EtudiantRepository extends RepositoryGeneric<Etudiant> {
    public List<Etudiant> findByNomE(String name);
}

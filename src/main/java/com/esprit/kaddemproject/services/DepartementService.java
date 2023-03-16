package com.esprit.kaddemproject.services;

import com.esprit.kaddemproject.entities.Departement;
import com.esprit.kaddemproject.generics.ServiceGeneric;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

public interface DepartementService extends ServiceGeneric<Departement> {

    public Departement assignEtudiantToDepartement(Integer etudId, Integer depId);

}

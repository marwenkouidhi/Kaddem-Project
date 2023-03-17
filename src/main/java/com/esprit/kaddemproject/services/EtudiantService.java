package com.esprit.kaddemproject.services;

import com.esprit.kaddemproject.entities.Etudiant;
import com.esprit.kaddemproject.generics.ServiceGeneric;

import java.util.List;

public interface EtudiantService extends ServiceGeneric<Etudiant> {

    public List<Etudiant> retrieveByNomE(String name);

    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);

}

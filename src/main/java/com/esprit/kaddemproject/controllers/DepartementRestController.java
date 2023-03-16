package com.esprit.kaddemproject.controllers;

import com.esprit.kaddemproject.entities.Departement;
import com.esprit.kaddemproject.generics.ControllerGeneric;

public interface DepartementRestController extends ControllerGeneric<Departement> {

    public Departement assignEtudiantToDepartement(Integer etudId, Integer depId);
}

package com.esprit.kaddemproject.controllers;

import com.esprit.kaddemproject.entities.Etudiant;
import com.esprit.kaddemproject.generics.ControllerGeneric;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EtudiantRestController extends ControllerGeneric<Etudiant> {
    public List<Etudiant> retreiveEtudiantByNomeE(@PathVariable String nomE);
}

package com.esprit.kaddemproject.controllers;

import com.esprit.kaddemproject.entities.Universite;
import com.esprit.kaddemproject.generics.ControllerGeneric;

public interface UniversiteRestController extends ControllerGeneric<Universite> {
    public Universite assignDepartmentToUniversite(Integer univId, Integer depId);
}

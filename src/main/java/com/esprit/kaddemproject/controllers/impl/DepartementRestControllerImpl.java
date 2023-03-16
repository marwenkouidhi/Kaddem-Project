package com.esprit.kaddemproject.controllers.impl;

import com.esprit.kaddemproject.controllers.DepartementRestController;
import com.esprit.kaddemproject.entities.Departement;
import com.esprit.kaddemproject.generics.impl.ControllerGenericImpl;
import com.esprit.kaddemproject.services.DepartementService;
import com.esprit.kaddemproject.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departement")
@AllArgsConstructor
public class DepartementRestControllerImpl extends ControllerGenericImpl<Departement> implements DepartementRestController {
    final DepartementService departementService;

    @Override
    @GetMapping("/assignEtu/{etudId}/{depId}")
    public Departement assignEtudiantToDepartement(@PathVariable Integer etudId, @PathVariable Integer depId) {
        return departementService.assignEtudiantToDepartement(etudId, depId);
    }
}

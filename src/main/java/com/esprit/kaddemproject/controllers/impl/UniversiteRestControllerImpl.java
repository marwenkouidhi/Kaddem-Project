package com.esprit.kaddemproject.controllers.impl;

import com.esprit.kaddemproject.controllers.UniversiteRestController;
import com.esprit.kaddemproject.entities.Universite;
import com.esprit.kaddemproject.generics.impl.ControllerGenericImpl;
import com.esprit.kaddemproject.services.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteRestControllerImpl extends ControllerGenericImpl<Universite> implements UniversiteRestController {

    final UniversiteService universiteService;

    @Override
    @GetMapping("/assignDep/{univId}/{depId}")
    public Universite assignDepartmentToUniversite(@PathVariable Integer univId, @PathVariable Integer depId) {
        return universiteService.assignDepartementToUniversite(univId, depId);
    }
}

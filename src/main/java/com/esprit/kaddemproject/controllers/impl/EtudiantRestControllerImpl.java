package com.esprit.kaddemproject.controllers.impl;

import com.esprit.kaddemproject.controllers.EtudiantRestController;
import com.esprit.kaddemproject.entities.Etudiant;
import com.esprit.kaddemproject.generics.impl.ControllerGenericImpl;
import com.esprit.kaddemproject.services.EtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor
public class EtudiantRestControllerImpl extends ControllerGenericImpl<Etudiant> implements EtudiantRestController {
    private final EtudiantService etudiantService;

    @GetMapping("/retreiveByName/{nomE}")
    public List<Etudiant> retreiveEtudiantByNomeE(@PathVariable String nomE) {
        return etudiantService.retrieveByNomE(nomE);
    }

    @Override
    @PostMapping("/contrat/{idContrat}/equipe/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e, @PathVariable Integer idContrat, @PathVariable Integer idEquipe) {
        return etudiantService.addAndAssignEtudiantToEquipeAndContract(e, idContrat, idEquipe);
    }
}

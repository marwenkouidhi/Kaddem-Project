package com.esprit.kaddemproject.controllers.impl;

import com.esprit.kaddemproject.controllers.EtudiantRestController;
import com.esprit.kaddemproject.entities.Etudiant;
import com.esprit.kaddemproject.generics.impl.ControllerGenericImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/etudiant")
public class EtudiantRestControllerImpl extends ControllerGenericImpl<Etudiant> implements EtudiantRestController {
}

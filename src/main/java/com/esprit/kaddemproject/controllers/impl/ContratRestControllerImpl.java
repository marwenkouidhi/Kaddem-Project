package com.esprit.kaddemproject.controllers.impl;

import com.esprit.kaddemproject.controllers.ContratRestController;
import com.esprit.kaddemproject.entities.Contrat;
import com.esprit.kaddemproject.generics.impl.ControllerGenericImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/contrat")
public class ContratRestControllerImpl extends ControllerGenericImpl<Contrat> implements ContratRestController {
}

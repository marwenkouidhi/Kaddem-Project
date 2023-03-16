package com.esprit.kaddemproject.controllers.impl;

import com.esprit.kaddemproject.controllers.DepartementRestController;
import com.esprit.kaddemproject.entities.Departement;
import com.esprit.kaddemproject.generics.impl.ControllerGenericImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departement")
public class DepartementRestControllerImpl extends ControllerGenericImpl<Departement> implements DepartementRestController {
}

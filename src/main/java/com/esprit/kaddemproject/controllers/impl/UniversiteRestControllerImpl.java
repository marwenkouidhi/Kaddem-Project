package com.esprit.kaddemproject.controllers.impl;

import com.esprit.kaddemproject.controllers.UniversiteRestController;
import com.esprit.kaddemproject.entities.Universite;
import com.esprit.kaddemproject.generics.impl.ControllerGenericImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/universite")
public class UniversiteRestControllerImpl extends ControllerGenericImpl<Universite> implements UniversiteRestController {
}

package com.esprit.kaddemproject.controllers.impl;

import com.esprit.kaddemproject.controllers.EquipeRestController;
import com.esprit.kaddemproject.entities.Equipe;
import com.esprit.kaddemproject.generics.impl.ControllerGenericImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipe")
public class EquipeRestControllerImpl extends ControllerGenericImpl<Equipe> implements EquipeRestController {
}

package com.esprit.kaddemproject.controllers.impl;

import com.esprit.kaddemproject.controllers.DetailEquipeRestController;
import com.esprit.kaddemproject.entities.DetailEquipe;
import com.esprit.kaddemproject.generics.impl.ControllerGenericImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detail-equipe")
public class DetailEquipeRestControllerImpl extends ControllerGenericImpl<DetailEquipe> implements DetailEquipeRestController {
}

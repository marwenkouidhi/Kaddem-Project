package com.esprit.kaddemproject.services.impl;

import com.esprit.kaddemproject.entities.Etudiant;
import com.esprit.kaddemproject.generics.impl.ServiceGenericImpl;
import com.esprit.kaddemproject.repositories.EtudiantRepository;
import com.esprit.kaddemproject.services.EtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl extends ServiceGenericImpl<Etudiant> implements EtudiantService {
    private final EtudiantRepository etudiantRepository;

    public List<Etudiant> retrieveByNomE(String name) {
        return etudiantRepository.findByNomE(name);
    }

}

package com.esprit.kaddemproject.services.impl;

import com.esprit.kaddemproject.entities.Departement;
import com.esprit.kaddemproject.entities.Universite;
import com.esprit.kaddemproject.generics.impl.ServiceGenericImpl;
import com.esprit.kaddemproject.repositories.DepartementRepository;
import com.esprit.kaddemproject.repositories.UniversiteRepository;
import com.esprit.kaddemproject.services.DepartementService;
import com.esprit.kaddemproject.services.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl extends ServiceGenericImpl<Universite> implements UniversiteService {
    final DepartementService departementService;
    final UniversiteRepository universiteRepository;

    public Universite assignDepartementToUniversite(Integer univId, Integer depId) {
        Universite universite = this.retrieveById(univId);
        Departement departement = departementService.retrieveById(depId);
        universite.getDepartements().add(departement);
        universiteRepository.save(universite);
        return universite;

    }

}

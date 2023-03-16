package com.esprit.kaddemproject.services.impl;

import com.esprit.kaddemproject.entities.Departement;
import com.esprit.kaddemproject.entities.Etudiant;
import com.esprit.kaddemproject.generics.impl.ServiceGenericImpl;
import com.esprit.kaddemproject.repositories.DepartementRepository;
import com.esprit.kaddemproject.services.DepartementService;
import com.esprit.kaddemproject.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class DepartementServiceImpl extends ServiceGenericImpl<Departement> implements DepartementService {
    final EtudiantService etudiantService;
    final DepartementRepository departementRepository;

    @Override
    public Departement assignEtudiantToDepartement(Integer etudId, Integer depId) {
        Departement departement = this.retrieveById(depId);
        Etudiant etudiant = etudiantService.retrieveById(etudId);
        departement.getEtudiants().add(etudiant);
        departementRepository.save(departement);
        return departement;
    }
}

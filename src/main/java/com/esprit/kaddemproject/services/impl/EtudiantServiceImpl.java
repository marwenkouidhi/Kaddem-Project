package com.esprit.kaddemproject.services.impl;

import com.esprit.kaddemproject.entities.Contrat;
import com.esprit.kaddemproject.entities.Equipe;
import com.esprit.kaddemproject.entities.Etudiant;
import com.esprit.kaddemproject.generics.impl.ServiceGenericImpl;
import com.esprit.kaddemproject.repositories.EtudiantRepository;
import com.esprit.kaddemproject.services.ContratService;
import com.esprit.kaddemproject.services.EquipeService;
import com.esprit.kaddemproject.services.EtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl extends ServiceGenericImpl<Etudiant> implements EtudiantService {
    private final EtudiantRepository etudiantRepository;
    private final ContratService contratService;
    private final EquipeService equipeService;

    public List<Etudiant> retrieveByNomE(String name) {
        return etudiantRepository.findByNomE(name);
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat contrat = contratService.retrieveById(idContrat);
        Equipe equipe = equipeService.retrieveById(idEquipe);

        if (contrat != null && equipe != null) {
            Etudiant etudiant = this.add(e);

            List<Equipe> equipes = new ArrayList<Equipe>();
            equipes.add(equipe);
            etudiant.setEquipes(equipes);

            List<Contrat> contrats = new ArrayList<Contrat>();
            contrats.add(contrat);
            etudiant.setContrats(contrats);

            etudiantRepository.save(etudiant);
            return etudiant;
        }

        return null;
    }

}

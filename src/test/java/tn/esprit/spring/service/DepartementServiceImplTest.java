package tn.esprit.spring.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import tn.esprit.kaddemproject.KaddemProjectApplication;
import tn.esprit.kaddemproject.entities.Departement;
import tn.esprit.kaddemproject.entities.Etudiant;
import tn.esprit.kaddemproject.entities.Option;
import tn.esprit.kaddemproject.services.IDepartementService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static tn.esprit.kaddemproject.entities.Option.GAMIX;

@SpringBootTest (classes = {KaddemProjectApplication.class})
@TestMethodOrder(OrderAnnotation.class)

class DepartementServiceImplTest {
    @Autowired
    IDepartementService ds;
    @Test
    @Order(1)
    public void testRetrieveAll() {
        List<Departement> listDepartements = ds.retrieveAll();
        Assertions.assertEquals(0, listDepartements.size());
    }
    @Test
    @Order(2)
    public void testAddDepartement() {
        Departement newDepartement = new Departement();
        newDepartement.setNomDepart("New Departement");

        // Create associated Etudiant entities if needed
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setNomE("Etudiant nom");
        etudiant1.setPrenomE("Etudiant prenom");
        etudiant1.setOptionE(Option.GAMIX);
        etudiant1.setDepartement(newDepartement);
        etudiant1.setContrats(null);
        etudiant1.setEquipes(null);

        newDepartement.setEtudiants(Collections.singletonList(etudiant1));

        Departement addedDepartement = ds.add(newDepartement);
        Assertions.assertNotNull(addedDepartement.getIdDepart());
    }
}

package tn.esprit.kaddemproject;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tn.esprit.kaddemproject.entities.*;
import tn.esprit.kaddemproject.repositories.ContratRepository;
import tn.esprit.kaddemproject.repositories.DepartementRepository;
import tn.esprit.kaddemproject.repositories.EquipeRepository;
import tn.esprit.kaddemproject.repositories.EtudiantRepository;
import tn.esprit.kaddemproject.services.IEtudiantService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)
public class EtudiantServiceImplJUnitTest {

    @Autowired
    IEtudiantService etudiantService;
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    EquipeRepository equipeRepository;
    @Autowired
    DepartementRepository departementRepository;
    @Autowired
    ContratRepository contratRepository;

    public static Integer idEtudiant;
    public static Integer idDepartement;

    @Test
    @Order(2)
    public void retrieveAllEtudiantsTest() {
        List<Etudiant> list = etudiantService.retrieveAll();
        Assertions.assertEquals(2, list.size());
    }

    @Test
    @Order(1)
    public void testAddEtudiants() {

        Etudiant etudiant1 = new Etudiant("nour1","chkiwa1", Option.GAMIX);
        Etudiant etudiant2 = new Etudiant("nour2","chkiwa2", Option.SE);

        etudiant1 = etudiantRepository.save(etudiant1);
        idEtudiant = etudiant1.getIdEtudiant();
        etudiant2 = etudiantRepository.save(etudiant2);
        Assertions.assertEquals(1, etudiant1.getIdEtudiant());
    }

    @Test
    @Order(3)
    public void updateEtudiantTest(){
        Etudiant etudiantUpdated1 = new Etudiant("nour10","chkiwa10", Option.GAMIX);
        etudiantUpdated1.setIdEtudiant(idEtudiant);
        Etudiant resultat = etudiantRepository.save(etudiantUpdated1);
        Assertions.assertEquals(1 , resultat.getIdEtudiant());
    }

    @Test
    @Order(4)
    public void assignEtudiantToDepartementTest()  {
        Departement departement = new Departement("Bloc E");
        departement = departementRepository.save(departement);
        idDepartement = departement.getIdDepart();
        etudiantService.assignEtudiantToDepartement(departement.getIdDepart(), idEtudiant);
        Etudiant etudiantResultat = etudiantRepository.findEtudiantByIdEtudiant(idEtudiant);
        Assertions.assertEquals(departement.getIdDepart(), etudiantResultat.getDepartement().getIdDepart());
    }

    @Test
    @Order(5)
    public void addAndAssignEtudiantToEquipeAndContractTest()  throws ParseException {
        Equipe equipe = new Equipe("ca", Niveau.EXPERT);
        equipe = equipeRepository.save(equipe);
        LocalDate date = LocalDate.now();
        Contrat contrat = new Contrat(date,date,Specialite.CLOUD,true,10);
        contrat = contratRepository.save(contrat);
        Etudiant etudiant = new Etudiant("nour","chkiwa", Option.GAMIX);
        Etudiant resultat = etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant,contrat.getIdContrat(),equipe.getIdEquipe());
        Assertions.assertEquals(resultat.getEquipes().get(0).getIdEquipe(), equipe.getIdEquipe());
    }

    @Test
    @Order(6)
    public void getEtudiantsByDepartementTest() {
        List<Etudiant> list = etudiantService.getEtudiantsByDepartement(idDepartement);
        assertEquals(1, list.size());
    }

}
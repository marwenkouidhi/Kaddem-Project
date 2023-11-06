package tn.esprit.spring.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.kaddemproject.entities.Departement;

import tn.esprit.kaddemproject.repositories.DepartementRepository;
import tn.esprit.kaddemproject.services.IDepartementServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class DepartementServiceImplMock {

    @Mock
    DepartementRepository departementRepository;
    @InjectMocks
    IDepartementServiceImpl departementService;

    Departement departement = new Departement(50,"TestMOCK",null);
    List<Departement> listDepartements = new ArrayList<Departement>() {
        {
            add(new Departement(51,"TestMOCK1",null));
            add(new Departement(52,"TestMOCK2",null));
        }
    };

    @Test
    public void testRetrieveDepartement() {

        Mockito.when(departementRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(departement));
        Departement departement1 = departementService.retrieveById(2);
        Assertions.assertNotNull(departement1);
    }

    @Test
    public void testRetrieveAllDepartements() {

        Mockito.when(departementRepository.findAll()).thenReturn(listDepartements);
        List<Departement> retrievedDepartements = departementService.retrieveAll();

        Assertions.assertNotNull(retrievedDepartements);
    }
}

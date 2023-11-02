// package tn.esprit.spring.service;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
// import org.junit.jupiter.api.Order;
// import org.junit.jupiter.api.TestMethodOrder;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Import;
// import tn.esprit.kaddemproject.KaddemProjectApplication;
// import tn.esprit.kaddemproject.entities.Departement;
// import tn.esprit.kaddemproject.services.IDepartementService;

// import java.util.List;
// @SpringBootTest (classes = {KaddemProjectApplication.class})
// @TestMethodOrder(OrderAnnotation.class)

// class DepartementServiceImplTest {
//     @Autowired
//     IDepartementService ds;
//     @Test
//     @Order(1)
//     public void testRetrieveAll() {
//         List<Departement> listDepartements = ds.retrieveAll();
//         Assertions.assertEquals(0, listDepartements.size());
//     }

// }

package tn.esprit.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.kaddemproject.entities.Departement;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {


    //JPQL
    @Query("SELECT u.departements " +
            "FROM Universite u " +
            "where u.idUniv = :idUniversite")
    List<Departement> retrieveDepartementsByUniversiteJPQL(@Param("idUniversite") Integer idUniversite);

    //SQL
	@Query(value="SELECT * " +
            "FROM Universite u " +
            "WHERE u.beneficiaire_id = :idbf",nativeQuery =true)
    List<Departement> retrieveDepartementsByUniversiteSQL(@Param("idUniversite") Integer idUniversite);

    //JPQL
    @Query("SELECT d " +
            "FROM Departement d " +
            "ORDER BY size(d.etudiants) DESC")
    List<Departement> getDepartementByStudentsNbrJPQL();

    //SQL
    @Query(value ="SELECT * "
            + "FROM Departement d "
            + "ORDER BY ((select COUNT(*) FROM assurance a WHERE a.beneficiaire_id = b.id)) DESC ", nativeQuery = true)
    List<Departement> getDepartementByStudentsNbrSQL();


}

package com.esprit.kaddemproject.services;

import com.esprit.kaddemproject.entities.Universite;
import com.esprit.kaddemproject.generics.ServiceGeneric;
import com.esprit.kaddemproject.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;


public interface UniversiteService extends ServiceGeneric<Universite> {

    public Universite assignDepartementToUniversite(Integer univId, Integer depId);

}

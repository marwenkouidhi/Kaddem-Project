package com.esprit.kaddemproject.generics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface RepositoryGeneric<T> extends JpaRepository<T, Integer> {

}

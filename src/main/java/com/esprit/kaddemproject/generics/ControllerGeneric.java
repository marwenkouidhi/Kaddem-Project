package com.esprit.kaddemproject.generics;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


public interface ControllerGeneric<T> {
	
	ResponseEntity<Object> save(@RequestBody T entity);
	
	ResponseEntity<T> findAll();
	
	ResponseEntity<String> delete(@PathVariable Long id);

}

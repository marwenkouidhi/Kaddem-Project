package com.esprit.kaddemproject.generics;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface ControllerGeneric<T> {
    public T add(@RequestBody T entity);

    public T update(@RequestBody T entity);

    public T retrieveById(@PathVariable Integer id);

    public List<T> retrieveAll();

    public Boolean delete(@PathVariable Integer id);
}

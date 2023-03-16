package com.esprit.kaddemproject.generics.impl;


import com.esprit.kaddemproject.generics.ControllerGeneric;
import com.esprit.kaddemproject.generics.ServiceGeneric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ControllerGenericImpl<T> implements ControllerGeneric<T> {

    @Autowired
    private ServiceGeneric<T> genericService;

    @PostMapping()
    public T add(@RequestBody T entity) {
        return genericService.add(entity);
    }

    @PutMapping()
    public T update(@RequestBody T entity) {
        return genericService.update(entity);
    }

    @GetMapping("/{id}")
    public T retrieveById(@PathVariable Integer id) {
        return genericService.retrieveById(id);
    }

    @GetMapping()
    public List<T> retrieveAll() {
        return genericService.retrieveAll();
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return genericService.delete(id);
    }
}

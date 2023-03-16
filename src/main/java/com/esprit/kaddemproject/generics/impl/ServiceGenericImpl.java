package com.esprit.kaddemproject.generics.impl;

import com.esprit.kaddemproject.generics.RepositoryGeneric;
import com.esprit.kaddemproject.generics.ServiceGeneric;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceGenericImpl<T> implements ServiceGeneric<T> {

    @Autowired
    protected RepositoryGeneric<T> genericRepository;

    @Override
    public List<T> findAll() throws Exception {
        try {
            return genericRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public T save(T entity) throws Exception {
        try {
            return genericRepository.save(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(Long id) throws Exception {
        try {
            genericRepository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }

}

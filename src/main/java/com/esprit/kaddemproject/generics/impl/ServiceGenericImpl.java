package com.esprit.kaddemproject.generics.impl;

import com.esprit.kaddemproject.generics.RepositoryGeneric;
import com.esprit.kaddemproject.generics.ServiceGeneric;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceGenericImpl<T> implements ServiceGeneric<T> {
    @Autowired
    protected RepositoryGeneric<T> baseRepository;

    @Override
    public T add(T entity) {
        return baseRepository.save(entity);
    }

    @Override
    public T update(T entity) {
        return baseRepository.save(entity);
    }

    @Override
    public T retrieveById(Integer id) {
        return baseRepository.findById(id).orElse(null);
    }

    @Override
    public List<T> retrieveAll() {
        return baseRepository.findAll();
    }

    @Override
    public Boolean delete(Integer id) {
        if (baseRepository.existsById(id)) {
            baseRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}

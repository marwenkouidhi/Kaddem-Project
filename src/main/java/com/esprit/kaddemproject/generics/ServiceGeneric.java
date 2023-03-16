package com.esprit.kaddemproject.generics;


import java.util.List;

public interface ServiceGeneric<T> {

    T add(T entity);

    T update(T entity);

    T retrieveById(Integer id);

    List<T> retrieveAll();

    Boolean delete(Integer id);

}

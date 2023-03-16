package com.esprit.kaddemproject.generics;


import java.util.List;

public interface ServiceGeneric<T>  {
	
	List<T> findAll() throws Exception;
	T save(T entity) throws Exception;
	void delete(Long id) throws Exception;
	
}

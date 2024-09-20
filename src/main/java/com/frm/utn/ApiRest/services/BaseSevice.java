package com.frm.utn.ApiRest.services;

import java.util.List;

public interface BaseSevice<T> {
    public List<T> findAll() throws Exception;
    public T findById(Long id) throws Exception;
    public T save(T entity) throws Exception;
    public T update(Long id, T entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}

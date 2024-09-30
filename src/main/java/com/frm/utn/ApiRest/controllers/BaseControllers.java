package com.frm.utn.ApiRest.controllers;

import com.frm.utn.ApiRest.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseControllers<T extends Base, ID extends Serializable> {
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getById(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody T entity);
    public ResponseEntity<?> update(@PathVariable ID id, T entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
}

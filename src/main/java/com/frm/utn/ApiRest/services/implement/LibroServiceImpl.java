package com.frm.utn.ApiRest.services.implement;

import com.frm.utn.ApiRest.entities.Libro;
import com.frm.utn.ApiRest.repositories.LibroRepository;
import com.frm.utn.ApiRest.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {
    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl(LibroRepository libroRepository) { super(libroRepository);}
}

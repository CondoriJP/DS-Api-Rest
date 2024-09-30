package com.frm.utn.ApiRest.controllers;

import com.frm.utn.ApiRest.entities.Libro;
import com.frm.utn.ApiRest.services.implement.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path= "api/v1/libro")
public class LibroController extends BaseControllersImpl<Libro, LibroServiceImpl> {
}

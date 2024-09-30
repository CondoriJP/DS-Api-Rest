package com.frm.utn.ApiRest.controllers;

import com.frm.utn.ApiRest.entities.Autor;
import com.frm.utn.ApiRest.services.implement.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path= "api/v1/autor")
public class AutorController extends BaseControllersImpl<Autor, AutorServiceImpl> {
}

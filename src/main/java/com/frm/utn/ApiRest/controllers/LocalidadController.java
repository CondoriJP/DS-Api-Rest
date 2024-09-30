package com.frm.utn.ApiRest.controllers;

import com.frm.utn.ApiRest.entities.Localidad;
import com.frm.utn.ApiRest.services.implement.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path= "api/v1/localidad")
public class LocalidadController extends BaseControllersImpl<Localidad, LocalidadServiceImpl> {
}

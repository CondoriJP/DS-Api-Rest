package com.frm.utn.ApiRest.controllers;

import com.frm.utn.ApiRest.entities.Domicilio;
import com.frm.utn.ApiRest.services.implement.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path= "api/v1/domicilio")
public class DomicilioController extends BaseControllersImpl<Domicilio, DomicilioServiceImpl> {
}

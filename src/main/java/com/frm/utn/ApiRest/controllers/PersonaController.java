package com.frm.utn.ApiRest.controllers;

import com.frm.utn.ApiRest.entities.Persona;
import com.frm.utn.ApiRest.services.implement.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path= "api/v1/persona")
public class PersonaController extends BaseControllersImpl<Persona, PersonaServiceImpl> {
}

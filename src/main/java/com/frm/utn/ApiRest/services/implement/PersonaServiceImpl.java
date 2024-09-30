package com.frm.utn.ApiRest.services.implement;

import com.frm.utn.ApiRest.entities.Persona;
import com.frm.utn.ApiRest.repositories.BaseRepository;
import com.frm.utn.ApiRest.repositories.PersonaRepository;
import com.frm.utn.ApiRest.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) { super(baseRepository);}
}

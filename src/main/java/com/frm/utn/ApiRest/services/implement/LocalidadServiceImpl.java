package com.frm.utn.ApiRest.services.implement;

import com.frm.utn.ApiRest.entities.Localidad;
import com.frm.utn.ApiRest.repositories.LocalidadRepository;
import com.frm.utn.ApiRest.services.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(LocalidadRepository localidadRepository) { super(localidadRepository);}
}

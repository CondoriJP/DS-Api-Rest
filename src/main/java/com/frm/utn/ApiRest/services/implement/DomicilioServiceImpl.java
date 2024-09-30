package com.frm.utn.ApiRest.services.implement;

import com.frm.utn.ApiRest.entities.Domicilio;
import com.frm.utn.ApiRest.repositories.DomicilioRepository;
import com.frm.utn.ApiRest.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {
    @Autowired
    private DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(DomicilioRepository domicilioRepository) { super(domicilioRepository);}
}

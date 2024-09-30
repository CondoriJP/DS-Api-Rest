package com.frm.utn.ApiRest.services.implement;

import com.frm.utn.ApiRest.entities.Autor;
import com.frm.utn.ApiRest.repositories.AutorRepository;
import com.frm.utn.ApiRest.repositories.BaseRepository;
import com.frm.utn.ApiRest.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) { super(baseRepository);}
}

package com.frm.utn.ApiRest.repositories;

import com.frm.utn.ApiRest.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}

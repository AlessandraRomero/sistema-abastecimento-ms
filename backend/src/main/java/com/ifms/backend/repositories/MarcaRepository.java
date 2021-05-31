package com.ifms.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifms.backend.entities.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}

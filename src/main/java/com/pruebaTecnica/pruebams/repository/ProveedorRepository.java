package com.pruebaTecnica.pruebams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebaTecnica.pruebams.model.ProveedorDO;

@Repository
public interface ProveedorRepository extends JpaRepository<ProveedorDO, Integer>{

	ProveedorDO findByNombre(String mombre);
}

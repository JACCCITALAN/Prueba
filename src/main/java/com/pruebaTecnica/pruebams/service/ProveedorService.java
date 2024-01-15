package com.pruebaTecnica.pruebams.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pruebaTecnica.pruebams.dto.BaseResponseDTO;
import com.pruebaTecnica.pruebams.dto.ProveedorDTO;
import com.pruebaTecnica.pruebams.model.ProveedorDO;
import com.pruebaTecnica.pruebams.repository.ProveedorRepository;

@Service
public class ProveedorService {

	@Autowired
	private ProveedorRepository proveedorRepository;

	public List<ProveedorDTO> getProveedores(Integer page, Integer numElements){
		
		Pageable pageable= PageRequest.of(page, numElements);
		Page<ProveedorDO> pageProvDO = proveedorRepository.findAll(pageable);
		List<ProveedorDO> listProvDO = pageProvDO.getContent();
		List<ProveedorDTO> listProvDTO =  new ArrayList<>();
		
		for(ProveedorDO  provDO : listProvDO ) {
			ProveedorDTO proveedorDTO = new ProveedorDTO();
			proveedorDTO.setNombre(provDO.getNombre());
			proveedorDTO.setDireccion(provDO.getDireccion());
			proveedorDTO.setFolio(provDO.getFolio());
			proveedorDTO.setTelefono(provDO.getTelefono());
			proveedorDTO.setRfc(provDO.getRfc());
			
			listProvDTO.add(proveedorDTO);
		}
		
		return listProvDTO;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public BaseResponseDTO<ProveedorDTO> addProveedor(ProveedorDTO proveedorDTO) {
		BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
		ProveedorDO proveedorDOExist = proveedorRepository.findByNombre(proveedorDTO.getNombre());
		
		if(null != proveedorDOExist) {
			baseResponseDTO.setData(new ArrayList<>());
			baseResponseDTO.setSuccess(Boolean.FALSE);
		}else {
			ProveedorDO proveedorDO = new ProveedorDO();
			proveedorDO.setNombre(proveedorDTO.getNombre());
			proveedorDO.setDireccion(proveedorDTO.getDireccion());
			proveedorDO.setFolio(proveedorDTO.getFolio());
			proveedorDO.setTelefono(proveedorDTO.getTelefono());
			proveedorDO.setRfc(proveedorDTO.getRfc());
			
			proveedorRepository.save(proveedorDO);
			baseResponseDTO.setSuccess(Boolean.TRUE);
			baseResponseDTO.setData(new ArrayList<>());
		}
		return baseResponseDTO;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public BaseResponseDTO<ProveedorDTO> removeProveedor(Integer idProv) {
		BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
		Optional<ProveedorDO> proveedorDO = proveedorRepository.findById(idProv);
		proveedorRepository.delete(proveedorDO.get());
		
		Optional<ProveedorDO> proveedorExistDO = proveedorRepository.findById(idProv);

		if(null != proveedorExistDO) {
			baseResponseDTO.setData(new ArrayList<>());
			baseResponseDTO.setSuccess(Boolean.FALSE);
		}else {
			baseResponseDTO.setSuccess(Boolean.TRUE);
			baseResponseDTO.setData(new ArrayList<>());
		}
		return baseResponseDTO;
	}
	
}

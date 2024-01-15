package com.pruebaTecnica.pruebams.web.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaTecnica.pruebams.dto.BaseResponseDTO;
import com.pruebaTecnica.pruebams.dto.ProveedorDTO;
import com.pruebaTecnica.pruebams.service.ProveedorService;

@RestController
@RequestMapping(value = "/api")
public class ProveedoresController {
	
	@Autowired
	private ProveedorService proveedorService;

	@GetMapping(value = "/getProveedores", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProveedorDTO> getProveedores(@RequestParam(name = "page") Integer page,  
			@RequestParam(name = "numElements") Integer numElemts){
		return proveedorService.getProveedores(page, numElemts);
	}
	
	@PostMapping(value = "/addProveedor", produces = MediaType.APPLICATION_JSON_VALUE)
	public BaseResponseDTO<ProveedorDTO> addProveedor(@RequestBody ProveedorDTO proveedorDTO) {
		return proveedorService.addProveedor(proveedorDTO);
	}
	
	@PostMapping(value = "/removeProveedor", produces = MediaType.APPLICATION_JSON_VALUE)
	public BaseResponseDTO<ProveedorDTO> removeProveedor(@RequestParam(name = "idProv") Integer idProv) {
		return proveedorService.removeProveedor(idProv);
	}

}

package com.code.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.modelmapper.ModelMapper;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.code.db.code_db.service.CompagniaService;
import com.code.db.code_db.entity.Compagnia;
import com.code.db.code_db.dtos.CompagniaDto;

//IMPORT RELATIONS

import com.code.db.code_db.service.ContattiService;


public class CompagniaBaseController {
    
    @Autowired
	CompagniaService compagniaService;

	
	@Autowired
	ContattiService contattiService;
	

	@Autowired
	private ModelMapper modelMapper;



//CRUD METHODS



/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	private CompagniaDto convertToDto(Compagnia compagnia) {
		CompagniaDto compagniaDto = modelMapper.map(compagnia, CompagniaDto.class);
		return compagniaDto;
	}
}

package com.code.db.code_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import com.code.db.code_db.entity.Compagnia;

import com.code.db.code_db.repositories.CompagniaRepository;

@Service
@Transactional
public class CompagniaBaseService {

	
	@Autowired
	CompagniaRepository compagniaRepository;


    // CRUD METHODS
    

}

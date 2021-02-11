package com.code.db.code_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import com.code.db.code_db.entity.Contatti;

import com.code.db.code_db.entity.Compagnia;

import com.code.db.code_db.repositories.ContattiRepository;

@Service
@Transactional
public class ContattiBaseService {

	
	@Autowired
	ContattiRepository contattiRepository;


    // CRUD METHODS
    

}

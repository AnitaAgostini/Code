package com.code.db.code_db.entity;

import javax.persistence.Entity;
import com.code.db.code_db.entity.base.ContattiBase;

@Entity
public class Contatti extends ContattiBase {

    public Contatti() {}

    public Contatti(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}

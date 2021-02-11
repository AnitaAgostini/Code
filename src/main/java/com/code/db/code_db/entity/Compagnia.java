package com.code.db.code_db.entity;

import javax.persistence.Entity;
import com.code.db.code_db.entity.base.CompagniaBase;

@Entity
public class Compagnia extends CompagniaBase {

    public Compagnia() {}

    public Compagnia(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}

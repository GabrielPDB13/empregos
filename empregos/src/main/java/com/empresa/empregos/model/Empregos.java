package com.empresa.empregos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empregos {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeempregos() {
		return nomeempregos;
	}
	public void setNomeempregos(String nomeempregos) {
		this.nomeempregos = nomeempregos;
	}
	String nomeempregos;

}

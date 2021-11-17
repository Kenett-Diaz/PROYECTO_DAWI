package com.electro.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARGO")
public class Cargo {
	
	@Id
	private String ID_cargo;
	private String NOM_CARGO;
	
	public Cargo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cargo [ID_cargo=" + ID_cargo + ", NOM_CARGO=" + NOM_CARGO + "]";
	}
	public String getID_cargo() {
		return ID_cargo;
	}
	public void setID_cargo(String iD_cargo) {
		ID_cargo = iD_cargo;
	}
	public String getNOM_CARGO() {
		return NOM_CARGO;
	}
	public void setNOM_CARGO(String nOM_CARGO) {
		NOM_CARGO = nOM_CARGO;
	}

	
}

package com.electro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DISTRITO")
public class Distrito {

	@Id
	@Column(name="cod_dist")
	  private int codigoDist;
	@Column(name="nom_dist")
	  private String nomDist;
	
	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Distrito [codigoDist=" + codigoDist + ", nomDist=" + nomDist + "]";
	}
	public int getCodigoDist() {
		return codigoDist;
	}
	public void setCodigoDist(int codigoDist) {
		this.codigoDist = codigoDist;
	}
	public String getNomDist() {
		return nomDist;
	}
	public void setNomDist(String nomDist) {
		this.nomDist = nomDist;
	}
	
}

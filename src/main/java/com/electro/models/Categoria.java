package com.electro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIA")
public class Categoria {

	@Id
	@Column(name="cod_cat")
	private int codigoCat;
	@Column(name="desc_cat")
	private String descCat;
	
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Categoria [codigoCat=" + codigoCat + ", descCat=" + descCat + "]";
	}

	public int getCodigoCat() {
		return codigoCat;
	}
	public void setCodigoCat(int codigoCat) {
		this.codigoCat = codigoCat;
	}
	public String getDescCat() {
		return descCat;
	}
	public void setDescCat(String descCat) {
		this.descCat = descCat;
	}


}
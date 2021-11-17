package com.electro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROVEEDOR")
public class Proveedor {

	@Id
	@Column(name="cod_prove")
	private String codigoProve;
	@Column(name="RUC_prove")
	private String ruc;
	@Column(name="ape_prove")
	private String apellidoProve;
	@Column(name="fijo_prove")
	private String fijoProve;
	@Column(name="direc_prove")
	private String direccionProve;
	@Column(name="email_prove")
	private String emailProve;
	@Column(name="cod_cat")
	private int codigoCat;
	
	
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Proveedor [codigoProve=" + codigoProve + ", ruc=" + ruc + ", apellidoProve=" + apellidoProve
				+ ", fijoProve=" + fijoProve + ", direccionProve=" + direccionProve + ", emailProve=" + emailProve
				+ ", codigoCat=" + codigoCat + "]";
	}
	public String getCodigoProve() {
		return codigoProve;
	}
	public void setCodigoProve(String codigoProve) {
		this.codigoProve = codigoProve;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getApellidoProve() {
		return apellidoProve;
	}
	public void setApellidoProve(String apellidoProve) {
		this.apellidoProve = apellidoProve;
	}
	public String getFijoProve() {
		return fijoProve;
	}
	public void setFijoProve(String fijoProve) {
		this.fijoProve = fijoProve;
	}
	public String getDireccionProve() {
		return direccionProve;
	}
	public void setDireccionProve(String direccionProve) {
		this.direccionProve = direccionProve;
	}
	public String getEmailProve() {
		return emailProve;
	}
	public void setEmailProve(String emailProve) {
		this.emailProve = emailProve;
	}
	public int getCodigoCat() {
		return codigoCat;
	}
	public void setCodigoCat(int codigoCat) {
		this.codigoCat = codigoCat;
	}
	
	
}

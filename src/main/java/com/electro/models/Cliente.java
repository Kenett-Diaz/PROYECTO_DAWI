package com.electro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {

	@Id
	@Column(name="cod_cli")
	  private String codigoCliente;
	@Column(name="DNI_cli")
	  private String dniCliente;
	@Column(name="nom_cli")
	  private String nombreCliente;
	@Column(name="ape_cli")
	  private String apellidoCliente;
	@Column(name="direc_cli")
	  private String direccionCliente;
	  private int cod_dist;
	@Column(name="cel_cli")
	  private String celularCliente;
	@Column(name="fijo_cli")
	  private String fijoCliente;
	@Column(name="email_cli")
	  private String mailCliente;
	@Column(name="clave_cli")
	  private String claveCliente;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", dniCliente=" + dniCliente + ", nombreCliente="
				+ nombreCliente + ", apellidoCliente=" + apellidoCliente + ", direccionCliente=" + direccionCliente
				+ ", cod_dist=" + cod_dist + ", celularCliente=" + celularCliente + ", fijoCliente=" + fijoCliente
				+ ", mailCliente=" + mailCliente + ", claveCliente=" + claveCliente + "]";
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public int getCod_dist() {
		return cod_dist;
	}
	public void setCod_dist(int cod_dist) {
		this.cod_dist = cod_dist;
	}
	public String getCelularCliente() {
		return celularCliente;
	}
	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}
	public String getFijoCliente() {
		return fijoCliente;
	}
	public void setFijoCliente(String fijoCliente) {
		this.fijoCliente = fijoCliente;
	}
	public String getMailCliente() {
		return mailCliente;
	}
	public void setMailCliente(String mailCliente) {
		this.mailCliente = mailCliente;
	}
	public String getClaveCliente() {
		return claveCliente;
	}
	public void setClaveCliente(String claveCliente) {
		this.claveCliente = claveCliente;
	}
	
	
}

package com.electro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADMINISTRADOR")
public class Administrador {
	@Id
	@Column(name = "ID_admi", length = 6)
	  private String codigoAdm; 		
	@Column(name = "nom_admi", length = 45)
	 private String nombreAdm; 		
	@Column(name = "apePat_admi", length = 25)
	  private String apePaternoAdm; 	
	@Column(name = "apeMat_admi", length = 20)
	  private String apeMaternoAdm; 	
	@Column(name = "DNI_admi", length = 8)
	  private String dniAdm; 	
	@Column(name = "fechNac_admi")
	  private String fechaNacAdm; 
	@Column(name = "dir_admi", length = 100)
	  private String direccionAdm; 
	
	  private int cod_dist; 
	@Column(name = "fijo_admi", length = 9)
	  private String fijoAdm ;	
	@Column(name = "cel_admi", length = 9)
	  private String celularAdm ;	
	@Column(name = "email_admi", length = 80)
	  private String correoAdm;
	@Column(name = "usuario_admi", length = 10)
	  private String usrAdm;
	@Column(name = "clave_admi", length = 15)
	  private String claveAdm;
	
	  private String ID_cargo;	
	@Column(name = "fech_contrato")
	  private String fechaContratoAdm ;	
	@Column(name = "sueldo")
	  private double sueldoAdm;
	
	
	//
	
	
	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Administrador [codigoAdm=" + codigoAdm + ", nombreAdm=" + nombreAdm + ", apePaternoAdm=" + apePaternoAdm
				+ ", apeMaternoAdm=" + apeMaternoAdm + ", dniAdm=" + dniAdm + ", fechaNacAdm=" + fechaNacAdm
				+ ", direccionAdm=" + direccionAdm + ", cod_dist=" + cod_dist + ", fijoAdm=" + fijoAdm + ", celularAdm="
				+ celularAdm + ", correoAdm=" + correoAdm + ", usrAdm=" + usrAdm + ", claveAdm=" + claveAdm
				+ ", ID_cargo=" + ID_cargo + ", fechaContratoAdm=" + fechaContratoAdm + ", sueldoAdm=" + sueldoAdm
				+ "]";
	}
	
	public Administrador(String codigoAdm, String nombreAdm, String apePaternoAdm, String apeMaternoAdm, String dniAdm,
			String fechaNacAdm, String direccionAdm, int cod_dist, String fijoAdm, String celularAdm, String correoAdm,
			String usrAdm, String claveAdm, String iD_cargo, String fechaContratoAdm, double sueldoAdm) {
		super();
		this.codigoAdm = codigoAdm;
		this.nombreAdm = nombreAdm;
		this.apePaternoAdm = apePaternoAdm;
		this.apeMaternoAdm = apeMaternoAdm;
		this.dniAdm = dniAdm;
		this.fechaNacAdm = fechaNacAdm;
		this.direccionAdm = direccionAdm;
		this.cod_dist = cod_dist;
		this.fijoAdm = fijoAdm;
		this.celularAdm = celularAdm;
		this.correoAdm = correoAdm;
		this.usrAdm = usrAdm;
		this.claveAdm = claveAdm;
		ID_cargo = iD_cargo;
		this.fechaContratoAdm = fechaContratoAdm;
		this.sueldoAdm = sueldoAdm;
	}
	public String getCodigoAdm() {
		return codigoAdm;
	}
	public void setCodigoAdm(String codigoAdm) {
		this.codigoAdm = codigoAdm;
	}
	public String getNombreAdm() {
		return nombreAdm;
	}
	public void setNombreAdm(String nombreAdm) {
		this.nombreAdm = nombreAdm;
	}
	public String getApePaternoAdm() {
		return apePaternoAdm;
	}
	public void setApePaternoAdm(String apePaternoAdm) {
		this.apePaternoAdm = apePaternoAdm;
	}
	public String getApeMaternoAdm() {
		return apeMaternoAdm;
	}
	public void setApeMaternoAdm(String apeMaternoAdm) {
		this.apeMaternoAdm = apeMaternoAdm;
	}
	public String getDniAdm() {
		return dniAdm;
	}
	public void setDniAdm(String dniAdm) {
		this.dniAdm = dniAdm;
	}
	public String getFechaNacAdm() {
		return fechaNacAdm;
	}
	public void setFechaNacAdm(String fechaNacAdm) {
		this.fechaNacAdm = fechaNacAdm;
	}
	public String getDireccionAdm() {
		return direccionAdm;
	}
	public void setDireccionAdm(String direccionAdm) {
		this.direccionAdm = direccionAdm;
	}
	public int getCod_dist() {
		return cod_dist;
	}
	public void setCod_dist(int cod_dist) {
		this.cod_dist = cod_dist;
	}
	public String getFijoAdm() {
		return fijoAdm;
	}
	public void setFijoAdm(String fijoAdm) {
		this.fijoAdm = fijoAdm;
	}
	public String getCelularAdm() {
		return celularAdm;
	}
	public void setCelularAdm(String celularAdm) {
		this.celularAdm = celularAdm;
	}
	public String getCorreoAdm() {
		return correoAdm;
	}
	public void setCorreoAdm(String correoAdm) {
		this.correoAdm = correoAdm;
	}
	public String getUsrAdm() {
		return usrAdm;
	}
	public void setUsrAdm(String usrAdm) {
		this.usrAdm = usrAdm;
	}
	public String getClaveAdm() {
		return claveAdm;
	}
	public void setClaveAdm(String claveAdm) {
		this.claveAdm = claveAdm;
	}
	public String getID_cargo() {
		return ID_cargo;
	}
	public void setID_cargo(String iD_cargo) {
		ID_cargo = iD_cargo;
	}
	public String getFechaContratoAdm() {
		return fechaContratoAdm;
	}
	public void setFechaContratoAdm(String fechaContratoAdm) {
		this.fechaContratoAdm = fechaContratoAdm;
	}
	public double getSueldoAdm() {
		return sueldoAdm;
	}
	public void setSueldoAdm(double sueldoAdm) {
		this.sueldoAdm = sueldoAdm;
	} 		
	    
	  
}

package com.electro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOLETA")
public class Boleta {

	@Id
	@Column(name="num_bol")
	private String numeroBoleta;
	@Column(name="fch_bol")
	private String fechaBoleta;
	@Column(name="cod_cli")
	  private String codigoCliente;
	private int cod_est;
	private double subtotal;
	private double igv;
	
	
	private double total;
	
	public Boleta() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Boleta [numeroBoleta=" + numeroBoleta + ", fechaBoleta=" + fechaBoleta + ", codigoCliente="
				+ codigoCliente + ", cod_est=" + cod_est + ", subtotal=" + subtotal + ", igv=" + igv + ", total="
				+ total + "]";
	}
	public String getNumeroBoleta() {
		return numeroBoleta;
	}
	public void setNumeroBoleta(String numeroBoleta) {
		this.numeroBoleta = numeroBoleta;
	}
	public String getFechaBoleta() {
		return fechaBoleta;
	}
	public void setFechaBoleta(String fechaBoleta) {
		this.fechaBoleta = fechaBoleta;
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public int getCod_est() {
		return cod_est;
	}
	public void setCod_est(int cod_est) {
		this.cod_est = cod_est;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}


}

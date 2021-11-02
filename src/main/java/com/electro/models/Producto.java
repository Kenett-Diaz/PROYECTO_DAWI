package com.electro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {
	@Id
	@Column(name ="cod_pro", length = 11)
	private  String codigoProducto;			
	@Column(name ="nombre", length = 150)
	private String nombreProducto;
	
	/*imagen				varchar(50)		NOT NULL,*/
	@Column(name="descripcion", length = 150)
	private String descipcionProducto;
	@Column(name="cod_cat")
	private int codigoCategoria;
	@Column(name="STOCK")
	private int stockProducto;
	@Column(name="PRECIO")
	private double precioProducto;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Producto() {
		super();
	}
	public Producto(String codigoProducto, String nombreProducto, String descipcionProducto, int codigoCategoria,
			int stockProducto, double precioProducto) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.descipcionProducto = descipcionProducto;
		this.codigoCategoria = codigoCategoria;
		this.stockProducto = stockProducto;
		this.precioProducto = precioProducto;
	}
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto
				+ ", descipcionProducto=" + descipcionProducto + ", codigoCategoria=" + codigoCategoria
				+ ", stockProducto=" + stockProducto + ", precioProducto=" + precioProducto + "]";
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDescipcionProducto() {
		return descipcionProducto;
	}
	public void setDescipcionProducto(String descipcionProducto) {
		this.descipcionProducto = descipcionProducto;
	}
	public int getCodigoCategoria() {
		return codigoCategoria;
	}
	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	public int getStockProducto() {
		return stockProducto;
	}
	public void setStockProducto(int stockProducto) {
		this.stockProducto = stockProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	
	
	
}

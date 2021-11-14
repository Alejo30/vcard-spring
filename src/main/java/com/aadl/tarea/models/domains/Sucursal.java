package com.aadl.tarea.models.domains;

import org.springframework.stereotype.Component;

@Component
public class Sucursal {
	
	private String codigoSucursal;
	private String ciudad;
	private String nombreSucursal;
	
	

	public Sucursal() {
	
		// TODO Auto-generated constructor stub
	}


	public Sucursal( String codigoSucursal, String ciudad, String nombreSucursal) {
		this.ciudad = ciudad;
		this.codigoSucursal = codigoSucursal;
		this.nombreSucursal = nombreSucursal;
	}
	
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodigoSucursal() {
		return codigoSucursal;
	}
	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}
	public String getNombreSucursal() {
		return nombreSucursal;
	}
	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}


	@Override
	public String toString() {
		return "" + codigoSucursal + "," + ciudad + ","
				+ nombreSucursal + "";
	}
	
	
	
	
}

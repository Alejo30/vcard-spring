package com.aadl.tarea.models.domains;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Ciudad {

	private Integer codigoCiudad;
	private String nombreCiudad;
	private List<Sucursal> sucursal;

	public List<Sucursal> getSucursal() {
		return sucursal;
	}
	public void setSucursal(List<Sucursal> sucursal) {
		this.sucursal = sucursal;
	}
	public Integer getCodigoCiudad() {
		return codigoCiudad;
	}
	public void setCodigoCiudad(Integer codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
}

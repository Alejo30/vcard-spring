package com.aadl.tarea.models.domains;

import java.util.List;



public class Vcard {

	private List<Empleado> empleados;
	private String descripcion;
	
	
	
	public Vcard() {
		
	}
	public Vcard(List<Empleado> empleados, String descripcion) {
		
		this.empleados = empleados;
		this.descripcion = descripcion;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}


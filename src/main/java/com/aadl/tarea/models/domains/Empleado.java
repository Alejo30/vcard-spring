package com.aadl.tarea.models.domains;

public class Empleado {

	private String nombres;
	private String apellidos;
	private Ciudad ciudad;
	private Sucursal sucursal;
	private String horario;
	private String correo;
	private String celular;
	private String paginaWeb;
	private Cargo cargo;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Empleado(String nombres, String apellidos, Ciudad ciudad, Sucursal sucursal, String horario, String correo,
			String celular, String paginaWeb, Cargo cargo) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.sucursal = sucursal;
		this.horario = horario;
		this.correo = correo;
		this.celular = celular;
		this.paginaWeb = paginaWeb;
		this.cargo = cargo;
	}

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Empleado [nombres=" + nombres + ", apellidos=" + apellidos + "]";
	}
	
	

}

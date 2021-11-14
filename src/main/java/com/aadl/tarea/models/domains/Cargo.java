package com.aadl.tarea.models.domains;

public class Cargo {

	private Integer cargoId;
	private String nombreCargo;
	
	
	
	public Cargo() {
		// TODO Auto-generated constructor stub
	}

	public Cargo(Integer cargoId, String nombreCargo) {
		this.cargoId = cargoId;
		this.nombreCargo = nombreCargo;
	}

	public Integer getCargoId() {
		return cargoId;
	}

	public void setCargoId(Integer cargoId) {
		this.cargoId = cargoId;
	}

	public String getNombreCargo() {
		return nombreCargo;
	}

	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}

	@Override
	public String toString() {
		return "" + nombreCargo + "";
	}

	

}

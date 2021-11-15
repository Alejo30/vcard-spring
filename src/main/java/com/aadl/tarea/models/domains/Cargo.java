package com.aadl.tarea.models.domains;

public class Cargo {

	private String cargoId;
	private String nombreCargo;
	
	
	
	public Cargo() {
		// TODO Auto-generated constructor stub
	}

	public Cargo(String cargoId, String nombreCargo) {
		this.cargoId = cargoId;
		this.nombreCargo = nombreCargo;
	}

	public String getCargoId() {
		return cargoId;
	}

	public void setCargoId(String cargoId) {
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
		return  cargoId + "," + nombreCargo;
	}

	

	

}

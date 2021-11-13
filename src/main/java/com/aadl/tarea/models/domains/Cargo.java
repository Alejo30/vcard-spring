package com.aadl.tarea.models.domains;

public class Cargo {

	private Integer cargoId;
	private String nombreCargo;

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

	public Cargo(Integer cargoId, String nombreCargo) {
		this.cargoId = cargoId;
		this.nombreCargo = nombreCargo;
	}

}

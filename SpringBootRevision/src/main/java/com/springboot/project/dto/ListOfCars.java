package com.springboot.project.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class ListOfCars {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	private String CarName;
	@Column
	private String CarModel;
	@Column
	private String CarType;

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String CarName) {
		this.CarName = CarName;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public String getCarType() {
		return CarType;
	}

	public void setCarType(String carType) {
		CarType = carType;
	}

	
}

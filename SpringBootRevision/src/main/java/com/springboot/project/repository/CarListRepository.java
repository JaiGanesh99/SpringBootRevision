package com.springboot.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.project.dto.ListOfCars;

public interface CarListRepository extends JpaRepository<ListOfCars, Long>{
//	List<ListOfCars> findByCarName(String CarName);
	
	
//	List<ListOfCars> findByCarName(String carName);
	
}

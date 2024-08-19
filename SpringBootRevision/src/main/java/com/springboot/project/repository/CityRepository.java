package com.springboot.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.dto.City;

public interface CityRepository extends JpaRepository<City, Long>{
	
//	@Query("select c from City c where c.name =?1")
	List<City> findByDistrict(String district);

}

package com.springboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.dto.City;
import com.springboot.project.dto.ListOfCars;
import com.springboot.project.repository.CarListRepository;
import com.springboot.project.repository.CityRepository;

@Controller
public class ControllerToViewExample {
	
	@Autowired
	private CityRepository cityRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/ControllerToView")
	public String ControllerToViewMethod() {
		return "ControllerToView";
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/CarData")
	public String ListOfCarDataToView(Model model) {
		ListOfCars cars = new ListOfCars();
		cars.setCarName("Hyndai");
		cars.setCarModel("2021");
		cars.setCarType("XUV");
		
		model.addAttribute("Cars",cars);
		
		return "ListOfCars";
		
	}
	
	@RequestMapping(value = "/DataBaseToView/{CityName}", method = RequestMethod.GET)
	public String DataBasetoView(@PathVariable("CityName") String CityName ,Model model) {
		List<City> city = cityRepository.findByDistrict(CityName);
		city.forEach(ct -> System.err.println("Data-->"+ct));
		model.addAttribute("City",city);
		return "ListOfCarsToDataBase";
	
	}
	
	@RequestMapping(value = "/SaveDataBasevalue", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ListOfCars> SavingDataIndataBase(@RequestBody City city) {
		cityRepository.save(city);
		return ResponseEntity.ok().build();
	
	}
	
	

}

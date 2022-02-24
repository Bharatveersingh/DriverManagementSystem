package com.Management.DriverManagementSystem.Controller;

import com.Management.DriverManagementSystem.DAO.*;
import com.Management.DriverManagementSystem.Entity.*;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;




@RestController
public class DriverController {
	
	 @Autowired
	    DriverDetailRepository DriverRepository;

	@PostMapping("/addDriver")
	public DriverDetail addDriver(@RequestBody DriverDetail driver) {

		return DriverRepository.saveDriver(driver);

	}

	@PutMapping("/updateDriver")
	public DriverDetail updateDriver(@RequestBody DriverDetail driver) {

		return DriverRepository.updateDriver(driver);

	}

	@GetMapping("/getDriver/{id}")
	public DriverDetail getDriver(@PathVariable("id") int id) {
		return DriverRepository.getById(id);
	}

	@GetMapping("/Drivers")
	public List<DriverDetail> getDrivers() {
		return DriverRepository.allDriver();
	}

	@DeleteMapping("/DeleteDriver/{id}")
	public String deleteDriver(@PathVariable("id") int id){
		return DriverRepository.deleteById(id);
	}
}

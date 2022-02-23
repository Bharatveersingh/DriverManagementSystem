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




@Controller
public class DriverController {
	
	 @Autowired
	    DriverDetailRepository DriverRepository;
	 
	@RequestMapping("/")
	public String home()
	{
		System.out.println("here we are");
		return "welcome";
	}
	@RequestMapping("/home")
	public String Insert()
	{
		System.out.println("here we are");
		return "home";
	}
	
	@RequestMapping("/update")
	public String update()
	{
		System.out.println("here we are");
		return "update";
	}
	

	    @PostMapping("/Driver")
	    public String addUser( DriverDetail driver) {
	    	System.out.println("method called");
	     DriverRepository.saveDriver(driver);
	     return "saved";

	    }

	    @PostMapping("/updateDriver")
	    public String updateDriver( DriverDetail driver) {
	    	System.out.println("update method called");
	         DriverRepository.updateDriver(driver);
	         return "home";

	    }

	    @GetMapping("/Driver/{FirstName}")
	    public DriverDetail getUser(@PathVariable("FirstName") String FirstName) {
	        return DriverRepository.getByName(FirstName);
	    }

	    @GetMapping("/Drivers")
	    public List<DriverDetail> getUsers() {
	        return DriverRepository.allDriver();
	    }

	    @DeleteMapping("/user/{id}")
	    public String deleteUser(@PathVariable("FirstName") String FirstName){
	        return DriverRepository.deleteByName(FirstName);
	    }

}

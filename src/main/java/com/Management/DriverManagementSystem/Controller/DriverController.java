package com.Management.DriverManagementSystem.Controller;

import com.Management.DriverManagementSystem.DAO.*;
import com.Management.DriverManagementSystem.Entity.*;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class DriverController {
	
	 @Autowired
	    DriverDetailRepository DriverRepository;
	 
	 @RequestMapping("/welcome")
	 public String home()
	 {
		 return "welcome";
	 }
	 
	 
	 @RequestMapping("Insert")
	 public String Insert()
	 {
		 return "Insert";
	 }
	 
	 
	 @PostMapping(value = "/addDriver")
		public ModelAndView insertstock(DriverDetail driver)
	 {
			
			DriverRepository.saveDriver(driver);
			return new ModelAndView("welcome");
					
	 }
	 
	 @GetMapping("/update/{id}")
	  public ModelAndView updateDriver(@PathVariable("id") int id) 
	 {
	 
		 ModelAndView mav = new ModelAndView("Update");
		 DriverDetail driver = DriverRepository.getById(id);
	     mav.addObject("driver",driver);
	     return mav; 
	  }

	 @PostMapping("/update/updateDriver")
	  public ModelAndView updatestocks(DriverDetail driver)
	  {
		  ModelAndView mv = new ModelAndView("welcome");
		  DriverRepository.updateDriver(driver);
		  
		  return mv;
	  }
	 

		@GetMapping("/Drivers")
		public String listStudents(Model model)
		{
			model.addAttribute("driver", DriverRepository.allDriver());
			return "welcome";
		}
	
		@GetMapping("/delete/{id}")
		public ModelAndView deletestock(@PathVariable("id") int id)
		{
			
			DriverRepository.deleteById(id);
			ModelAndView mav = new ModelAndView("welcome");
			return mav;
			
		}
}

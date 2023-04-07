package com.first.webapp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.webapp.Util.EmailUtil;
import com.first.webapp.entites.Location;
import com.first.webapp.repository.LocationRepository;

@Controller
public class LocationController {

	@Autowired
LocationRepository locationRepo;
	@Autowired
	EmailUtil emailUtil;
	
	@RequestMapping("/yourLocation")
    public String yourLocation() {
		return "yourLocation";
    	
    }
	
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location")Location location,ModelMap modelMap) {
		
		locationRepo.save(location);
	    emailUtil.sendEmail("Sumitgiri1031@gmail.com", "Test Email", "Body is saved");
		modelMap.addAttribute("msg", "Location saved!!!");
		return "yourLocation";
	}	
 
	
	@RequestMapping("/getLocation")
	public String getLocation(ModelMap modelMap) {
	  List<Location> locations = (List<Location>) locationRepo.findAll();
	modelMap.addAttribute("locations", locations);
		return "getLocation";
		
	}  
	
		
	}
	
	
	


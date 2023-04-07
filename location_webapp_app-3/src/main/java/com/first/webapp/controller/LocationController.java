package com.first.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.webapp.entites.Location;
import com.first.webapp.repository.LocationRepository;

@Controller
public class LocationController {
	@Autowired
	LocationRepository locationRepo;
 
	@RequestMapping("/yourLocation")
    public String yourLocation() {
		return "yourLocation";
    	
    }
	
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location")Location location,ModelMap modelMap) {
		locationRepo.save(location);
		modelMap.addAttribute("msg", "Location saved!!!");
		return "yourLocation";
	}	
 
	
	@RequestMapping("/getLocation")
	public String getLocation(ModelMap modelMap) {
	List<Location> locations = locationRepo.findAll();
	modelMap.addAttribute("locations", locations);
		return "getLocation";
		
	}
	
	
	
}

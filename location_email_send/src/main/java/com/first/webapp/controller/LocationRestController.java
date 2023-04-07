package com.first.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.webapp.entites.Location;
import com.first.webapp.repository.LocationRepository;

@RestController
@RequestMapping("/location")
public class LocationRestController{
	

		
		@Autowired
		LocationRepository locationRepo;
		

		@PostMapping                                                          // create
		public Location saveLocation(@RequestBody Location location) {
			return locationRepo.save(location);
			
		}
		@GetMapping                                                       //Read
		public List<Location> getAllLocations() {
			return (List<Location>) locationRepo.findAll();
		
		}
		@PutMapping                                                          // Update
		public Location UpadteLocation(@RequestBody Location location) {
			return locationRepo.save(location);
		
		}
		
		@DeleteMapping("/{id}")                                             //Delete
		public void deleteLocation(@PathVariable("id")Integer id) {
			locationRepo.deleteById(id);
			
		}
		

}

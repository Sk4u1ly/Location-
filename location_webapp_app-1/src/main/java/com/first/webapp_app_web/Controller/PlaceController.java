package com.first.webapp_app_web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.webapp_app_web.Repository.PlaceRepository;

@Controller
public class PlaceController {
  
	@Autowired
	 PlaceRepository placeRepo;
	
	 @RequestMapping("/showPlace")
	 public String showLocation(){
		 return"showPlace";
	 }
	
	
}

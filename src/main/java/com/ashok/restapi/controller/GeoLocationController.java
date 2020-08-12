package com.ashok.restapi.controller;


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

import com.ashok.restapi.model.GeoLocation;
import com.ashok.restapi.service.GeoLocationService;

@RestController
@RequestMapping(path = "geolocation")
//@RequestMapping("api/v1/geolocation")
public class GeoLocationController {
	
	
	@Autowired
	private GeoLocationService geoLocationService;
	
	@GetMapping("/list")
	public List<GeoLocation> getGeoLocations() {
		return geoLocationService.getGeoLocations();
	}
	
	@GetMapping("/get/{loc_id}")
	public GeoLocation getGeoLocation(@PathVariable(name = "loc_id") Long id) {
		return geoLocationService.getGeoLocatioById(id);
	}

	@PostMapping("/create")
	public GeoLocation createGeoLocation(@RequestBody GeoLocation geoLocation) {
		return geoLocationService.createGeoLocatio(geoLocation);
	}
	
	@PutMapping("/update/{loc_id}")
	public GeoLocation upateGeoLocation(@PathVariable(name="loc_id") Long id, @RequestBody GeoLocation geoLocation) {
		return geoLocationService.updateGeoLocatioById(id, geoLocation);
		
	}
	
	@DeleteMapping("/delete/{loc_id}")
	public GeoLocation deleteGeoLocation(@PathVariable(name="loc_id") Long id) {
		return geoLocationService.deleteGeoLocatioById(id);
	}
}
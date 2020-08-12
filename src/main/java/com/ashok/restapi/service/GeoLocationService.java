package com.ashok.restapi.service;

import java.util.List;

import com.ashok.restapi.model.GeoLocation;


public interface GeoLocationService {

	List<GeoLocation> getGeoLocations();
	GeoLocation createGeoLocatio(GeoLocation geoLocation);
	GeoLocation getGeoLocatioById(Long id);
	GeoLocation updateGeoLocatioById(Long id, GeoLocation geoLocation);
	GeoLocation deleteGeoLocatioById(Long id);
	
	
}

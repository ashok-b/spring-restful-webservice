package com.ashok.restapi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashok.restapi.model.GeoLocation;
import com.ashok.restapi.repository.GeoLocationRepository;

@Service
public class GeoLocationServiceImpl implements GeoLocationService{

	@Autowired
	private GeoLocationRepository geoLocationRepository;
	
	@Override
	public List<GeoLocation> getGeoLocations() {
		return geoLocationRepository.findAll();
	}

	@Override
	public GeoLocation createGeoLocatio(GeoLocation geoLocation) {
		return geoLocationRepository.saveAndFlush(geoLocation);
	}

	@Override
	public GeoLocation getGeoLocatioById(Long id) {
		return geoLocationRepository.findById(id).get();
	}

	
	@Override
	public GeoLocation updateGeoLocatioById(Long id, GeoLocation geoLocation) {
		GeoLocation existing = geoLocationRepository.findById(id).get();
		BeanUtils.copyProperties(geoLocation, existing);
		return geoLocationRepository.saveAndFlush(existing);
	}

	@Override
	public GeoLocation deleteGeoLocatioById(Long id) {
		GeoLocation existing = geoLocationRepository.findById(id).get();
		geoLocationRepository.deleteById(id);
		return existing;
	}

}

package com.ashok.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.restapi.model.GeoLocation;

public interface GeoLocationRepository extends JpaRepository<GeoLocation, Long> {

}

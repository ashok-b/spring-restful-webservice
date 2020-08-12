package com.ashok.restapi.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class GeoLocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double longitude;
	private double latitude;
	private long userId;
	
    //private Date creationDateTime;
	
	public GeoLocation() {
	
	}
	
	
	public GeoLocation(long id, double longitude, double latitude, long userId) {
		super();
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
		this.userId = userId;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	

}

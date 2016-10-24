/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goeuro.yp.entity;

/**
 *
 * @author yp
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class GeoObjectPosition {

	@SerializedName("latitude")
	@Expose
	private Double latitude;
	@SerializedName("longitude")
	@Expose
	private Double longitude;

	/**
	 *
	 * @return The latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 *
	 * @param latitude The latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 *
	 * @return The longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 *
	 * @param longitude The longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}

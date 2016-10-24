/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goeuro.yp.entity;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yp
 */
public class GeoObjectTest {

	private static final Logger log = LoggerFactory.getLogger(GeoObjectTest.class);

	@Test
	public void testGetId() {
		log.info("getId");
		GeoObject instance = new GeoObject();
		instance.setId(1);
		Integer expResult = 1;
		Integer result = instance.getId();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetKey() {
		log.info("getKey");
		GeoObject instance = new GeoObject();
		instance.setKey(1);
		Object expResult = 1;
		Object result = instance.getKey();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetName() {
		log.info("getName");
		GeoObject instance = new GeoObject();
		String expResult = "TestName";
		instance.setName(expResult);
		String result = instance.getName();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetFullName() {
		log.info("getFullName");
		GeoObject instance = new GeoObject();
		String expResult = "TestFullName";
		instance.setFullName(expResult);
		String result = instance.getFullName();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetIataAirportCode() {
		log.info("getIataAirportCode");
		GeoObject instance = new GeoObject();
		Object expResult = "TestIataAirportCode";
		instance.setIataAirportCode(expResult);
		Object result = instance.getIataAirportCode();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetType() {
		log.info("getType");
		GeoObject instance = new GeoObject();
		String expResult = "TestType";
		instance.setType(expResult);
		String result = instance.getType();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetCountry() {
		log.info("getCountry");
		GeoObject instance = new GeoObject();
		String expResult = "TestCountry";
		instance.setCountry(expResult);
		String result = instance.getCountry();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetGeoPosition() {
		log.info("getGeoPosition");
		GeoObject instance = new GeoObject();
		GeoObjectPosition expResult = new GeoObjectPosition();
		expResult.setLatitude(11.0);
		expResult.setLongitude(22.0);
		instance.setGeoPosition(expResult);
		GeoObjectPosition result = instance.getGeoPosition();
		assertEquals(expResult.getLatitude(), result.getLatitude());
		assertEquals(expResult.getLongitude(), result.getLongitude());
	}

	@Test
	public void testGetLocationId() {
		log.info("getLocationId");
		GeoObject instance = new GeoObject();
		Integer expResult = 1;
		instance.setLocationId(expResult);
		Integer result = instance.getLocationId();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetInEurope() {
		log.info("getInEurope");
		GeoObject instance = new GeoObject();
		Boolean expResult = true;
		instance.setInEurope(expResult);
		Boolean result = instance.getInEurope();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetCountryCode() {
		log.info("getCountryCode");
		GeoObject instance = new GeoObject();
		String expResult = "TestCountryCode";
		instance.setCountryCode(expResult);
		String result = instance.getCountryCode();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetCoreCountry() {
		log.info("getCoreCountry");
		GeoObject instance = new GeoObject();
		Boolean expResult = false;
		instance.setCoreCountry(expResult);
		Boolean result = instance.getCoreCountry();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetDistance() {
		log.info("getDistance");
		GeoObject instance = new GeoObject();
		Object expResult = 123;
		instance.setDistance(expResult);
		Object result = instance.getDistance();
		assertEquals(expResult, result);
	}

}

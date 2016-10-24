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
public class GeoObjectPositionTest {

	private static final Logger log = LoggerFactory.getLogger(GeoObjectPositionTest.class);

	@Test
	public void testGetLatitude() {
		log.info("getLatitude");
		GeoObjectPosition instance = new GeoObjectPosition();
		Double expResult = 11.0;
		instance.setLatitude(expResult);
		Double result = instance.getLatitude();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetLongitude() {
		log.info("getLongitude");
		GeoObjectPosition instance = new GeoObjectPosition();
		Double expResult = 22.0;
		instance.setLongitude(expResult);
		Double result = instance.getLongitude();
		assertEquals(expResult, result);
	}

}

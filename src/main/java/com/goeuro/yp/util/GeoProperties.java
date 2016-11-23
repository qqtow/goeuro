/*
 * To change this license header, choose License Headers in Project GeoProperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goeuro.yp.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yp
 */
public class GeoProperties {

	private static final String config = "config.properties";
	private static final Logger log = LoggerFactory.getLogger(GeoProperties.class);
	private static Properties prop;

	private static void init() {
		prop = new Properties();
		try (InputStream input = GeoProperties.class.getClassLoader().getResourceAsStream(config)) {
			prop.load(input);
		} catch (IOException ex) {
			log.error("Exception: ", ex);
		}
	}

	public static String get(String key) {
		ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle");
		if (prop == null) {
			init();
		}
		if (prop != null) {
			return prop.getProperty(key);
		}
		throw new RuntimeException(bundle.getString("MESS_FAILEDTOREADPROPERTIESKEY") + key);
	}
}

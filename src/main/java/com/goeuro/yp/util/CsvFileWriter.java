/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goeuro.yp.util;

import com.goeuro.yp.entity.GeoObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yp
 */
public class CsvFileWriter {

	private static final Logger log = LoggerFactory.getLogger(CsvFileWriter.class);
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	public static void writeCsvFile(String fileName, GeoObject[] objects) {
		FileWriter fileWriter = null;
		ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle");
		try {
			fileWriter = new FileWriter(fileName);
			for (GeoObject geo : objects) {
				fileWriter.append(String.valueOf(geo.getId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(geo.getName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(geo.getType());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(geo.getGeoPosition().getLatitude()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(geo.getGeoPosition().getLatitude()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			log.info(bundle.getString("MESS_FILEWASCREATED"));
		} catch (Exception e) {
			log.error(bundle.getString("MESS_FAILEDTOCREATEFILE"), e);
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				log.error(bundle.getString("MESS_FAILEDTOCLOSEFILE"), e);
			}
		}
	}
}

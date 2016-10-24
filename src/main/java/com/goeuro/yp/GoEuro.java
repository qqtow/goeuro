/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goeuro.yp;

import com.goeuro.yp.entity.GeoObject;
import com.goeuro.yp.util.CsvFileWriter;
import com.goeuro.yp.util.GeoProperties;
import com.goeuro.yp.util.JsonUrlReader;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yp
 */
public class GoEuro {

	private final static String urlKey = "url";
	private final static String fileNameKey = "file";
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(GoEuro.class);

	public static void main(String[] args) {
		ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle");
		if (args.length != 1) {
			log.info(bundle.getString("MESS_STARTPARAM"));
			System.exit(0);
		}
		try {
			String url = GeoProperties.get(urlKey) + Locale.getDefault().getLanguage() + "/" + args[0];
			String jsonResponce = JsonUrlReader.readJsonFromUrl(url);
			log.debug("jsonResponce={}", jsonResponce);
			Gson gson = new Gson();
			GeoObject[] objects = gson.fromJson(jsonResponce, GeoObject[].class);
			for (GeoObject geo : objects) {
				log.debug("geo={}", geo);
			}
			if (objects.length == 0) {
				log.info(bundle.getString("MESS_NORESULTFOUND"), args[0]);
			} else {
				CsvFileWriter.writeCsvFile(GeoProperties.get(fileNameKey), objects);
			}
		} catch (IOException ex) {
			log.error("ERROR: ", ex);
		}
	}
}

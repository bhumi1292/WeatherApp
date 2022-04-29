package com.statista.weather.app;
/**
 * Please refer to https://darksky.net/dev/docs on how to access the DarkSky
 * API. The API key to use will be provided.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;


/**
 * Used https://www.weatherapi.com/api-explorer.aspx API to retrieve the weather data and implement method to get all the data 
 * @author bhumi Domadiya
 *
 */
public class DarkSkyWeatherService implements IWeatherService {

	private String url = "https://api.tutiempo.net/json/?lan=de&apid=zwDX4azaz4X4Xqs&lid=";
	private URL link;
	private String jsonText;
/**
 * Demonstrate parameter Constructor which wait for cityId.
 * @param cityId
 */
	public DarkSkyWeatherService(String cityId) {
		url = url + cityId;
		try {
			link = new URL(url);
		} catch (MalformedURLException error) {
			error.printStackTrace();
		}
	}
/**
 * Abstract Method implementation
 * Here: BufferReader reads the InputStream which we will get from API
 *  
 */
	@Override
	public String readWeather() {
		try (BufferedReader read = new BufferedReader(
				new InputStreamReader(link.openStream(), Charset.forName("UTF-8")))) {
			StringBuilder preparing = new StringBuilder();
			String alreadyRead = "";
			while (true) {
				alreadyRead = read.readLine();
				if (alreadyRead == null) {
					break;
				}
				preparing.append(alreadyRead);
			}

			jsonText = preparing.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonText;
	}

}

package com.statista.weather.app;

import com.google.gson.Gson;
/**
 * This class convert JSon data into a readable format and also fetch the data what we needed from JSon.
 * in sort we are converting 7 day data into readable format.
 * @author bhumi Domadiya
 *
 */
public class SevenDayWeather {
	
	private Day[] weekdays = new Day[7];
	
	public SevenDayWeather(String cityId) {
		
		DarkSkyWeatherService dataread = new DarkSkyWeatherService(cityId);
		String completeInfo = dataread.readWeather();
		
		String[] dayInfo = completeInfo.split("day"+"\\d");
		Gson gson = new Gson();
		
		for(int i =0; i<6 ;i++) {
			int indexInFile = i+1;
			String jsonDay = dayInfo[indexInFile].substring(2,dayInfo[indexInFile].length()-2);
			weekdays[i] = gson.fromJson(jsonDay, Day.class);
		}
		
		readSeventhDay(gson,dayInfo[7]);
		
	}

	private void readSeventhDay(Gson gson, String infoOfSeventhday) {
		String jsonSeventhDay = infoOfSeventhday.split("hour")[0];
		//System.out.println(jsonSeventhDay);
		jsonSeventhDay = jsonSeventhDay.substring(2,jsonSeventhDay.length()-2);
		weekdays[6]= gson.fromJson(jsonSeventhDay, Day.class);
	}

	/**
	 * @return the weekdays
	 */
	public Day[] getWeekdays() {
		return weekdays;
	}

}

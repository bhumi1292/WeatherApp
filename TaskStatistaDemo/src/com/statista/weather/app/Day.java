package com.statista.weather.app;

import com.google.gson.annotations.SerializedName;

/**
 * https://api.tutiempo.net/de/json.html
 * Here we define all the attribute that is needed to check weather and fetch the information from API by comparing the attribute
 * @author bhumi
 *
 */
public class Day {
	
	@SerializedName("date")
	private String date;
	
	@SerializedName("temperature_max")
	private int temprature_max;// "temperature_max": 14,
	@SerializedName("temperature_min")
	private int temprature_min;// "temperature_min": 8,
	private String icon;// "icon": "7",
	private String text;// "text": "Bedeckt",
	@SerializedName("humidity")
	private String humidity;// "humidity": 56,
	private String wind;// "wind": 21,
	@SerializedName("wind_direction")
	private String windirection;// "wind_direction": "Westen",
	@SerializedName("icon_wind")
	private String iconwind;// "icon_wind": "O",
	@SerializedName("sunrise")
	private String sunrise;// "sunrise": "7:47",
	@SerializedName("sunset")
	private String sunset;// "sunset": "18:09",
	@SerializedName("moonrise")
	private String moonrise;// "moonrise": "15:42",
	@SerializedName("moonset")
	private String moonset;// "moonset": "01:39",
	@SerializedName("moon_phases_icon")
	private String moonIcon;// "moon_phases_icon": "9"
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the temprature_max
	 */
	public int getTemprature_max() {
		return temprature_max;
	}
	/**
	 * @param temprature_max the temprature_max to set
	 */
	public void setTemprature_max(int temprature_max) {
		this.temprature_max = temprature_max;
	}
	/**
	 * @return the temprature_min
	 */
	public int getTemprature_min() {
		return temprature_min;
	}
	/**
	 * @param temprature_min the temprature_min to set
	 */
	public void setTemprature_min(int temprature_min) {
		this.temprature_min = temprature_min;
	}
	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the humidity
	 */
	public String getHumidity() {
		return humidity;
	}
	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	/**
	 * @return the wind
	 */
	public String getWind() {
		return wind;
	}
	/**
	 * @param wind the wind to set
	 */
	public void setWind(String wind) {
		this.wind = wind;
	}
	/**
	 * @return the windirection
	 */
	public String getWindirection() {
		return windirection;
	}
	/**
	 * @param windirection the windirection to set
	 */
	public void setWindirection(String windirection) {
		this.windirection = windirection;
	}
	/**
	 * @return the iconwind
	 */
	public String getIconwind() {
		return iconwind;
	}
	/**
	 * @param iconwind the iconwind to set
	 */
	public void setIconwind(String iconwind) {
		this.iconwind = iconwind;
	}
	/**
	 * @return the sunrise
	 */
	public String getSunrise() {
		return sunrise;
	}
	/**
	 * @param sunrise the sunrise to set
	 */
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	/**
	 * @return the sunset
	 */
	public String getSunset() {
		return sunset;
	}
	/**
	 * @param sunset the sunset to set
	 */
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	/**
	 * @return the moonrise
	 */
	public String getMoonrise() {
		return moonrise;
	}
	/**
	 * @param moonrise the moonrise to set
	 */
	public void setMoonrise(String moonrise) {
		this.moonrise = moonrise;
	}
	/**
	 * @return the moonset
	 */
	public String getMoonset() {
		return moonset;
	}
	/**
	 * @param moonset the moonset to set
	 */
	public void setMoonset(String moonset) {
		this.moonset = moonset;
	}
	/**
	 * @return the moonIcon
	 */
	public String getMoonIcon() {
		return moonIcon;
	}
	/**
	 * @param moonIcon the moonIcon to set
	 */
	public void setMoonIcon(String moonIcon) {
		this.moonIcon = moonIcon;
	}
	@Override
	public String toString() {
		return "Day [date=" + date + ", temprature_max=" + temprature_max + ", temprature_min=" + temprature_min
				+ ", icon=" + icon + ", text=" + text + ", humidity=" + humidity + ", wind=" + wind + ", windirection="
				+ windirection + ", iconwind=" + iconwind + ", sunrise=" + sunrise + ", sunset=" + sunset
				+ ", moonrise=" + moonrise + ", moonset=" + moonset + ", moonIcon=" + moonIcon + "]";
	}
}
	



package com.rim.lang.string.ex1;

public class WeatherMain {

	public static void main(String[] args) {
		Weather w = new Weather();
		WeatherInit wi=new WeatherInit();
		Weather[] ws = null;
		
		ws=wi.getWeathers();
		wi.printWeather(ws);

	}

}

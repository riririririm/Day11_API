package com.rim.lang.string.ex1;

public class WeatherInit extends Weather{
	private String info;
	
	public WeatherInit() {
		info = "seoul,맑음,10,20,0.3,daejon,비,-22,50,0.1,"
				+ "incheon,태풍,56,90,22.2,jeju,흐림,15,10,1.2";
		
	}
	
	public Weather[] getWeathers() {
		String[] ar = this.info.split(",");
		Weather[] weathers = new Weather[ar.length/5];
		
		for(int i=0;i<weathers.length;i++) {
			Weather w = new Weather();
			w.setCity(ar[5*i]);
			w.setSta(ar[5*i+1]);
			w.setTem(ar[5*i+2]);
			w.setHum(ar[5*i+3]);
			w.setDust(ar[5*i+4]);
			weathers[i]=w;
		}	
		return weathers;
	}
	
	public void printWeather(Weather[] ws) {
		for(int i=0;i<ws.length;i++) {
			System.out.println("도시:" + ws[i].getCity());
			System.out.println("날씨:" + ws[i].getSta());
			System.out.println("습도:" + ws[i].getHum());
			System.out.println("온도:" + ws[i].getTem());
			System.out.println("미세먼지:" + ws[i].getDust());
			System.out.println("================================");
		}  
	}

}

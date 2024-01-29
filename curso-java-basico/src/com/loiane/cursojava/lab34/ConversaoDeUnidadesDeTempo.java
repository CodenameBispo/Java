package com.loiane.cursojava.lab34;

public class ConversaoDeUnidadesDeTempo {
	
	public static double litroCentimetros3(double litro) {
		
		return litro*1000; 
	}	
	
	public static double minToSec(double min) {
		
		return min*60;
	}
	
	public static double hourToMin(double hour) {
		
		return hour*60;
	}
	
	public static double dayToHour(double day) {
		
		return day*24;
	}
	
	public static double monthToDay(double month) {
		
		return month*30;
	}
	
	public static double yearToDay(double year) {
		
		return year*365.25;
	}
}

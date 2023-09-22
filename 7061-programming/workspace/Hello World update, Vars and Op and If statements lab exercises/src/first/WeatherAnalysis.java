/**
 * 
 */
package first;

import java.util.ArrayList;

/**
 * I decided to take a functional programming approach rather than hardcoding too many things
 * this is because I am a big nerd :)
 */
public class WeatherAnalysis {

	/**
	 * @param args
	 */
	
	static double sumTemperatures (ArrayList<Double> temperatures) {
		double sum = 0;
		
		for (int i = 0 ; i < temperatures.size() ; i++ ) {
			sum += temperatures.get(i);
		}
		
		
		return sum;
	}
	
	static double averageTemperatures (ArrayList<Double> temperatures) {
		double numberOfEntries = temperatures.size();
		
		double sumOfTemperatures = sumTemperatures(temperatures);
		
		double averageTemperature = sumOfTemperatures / numberOfEntries;
		
		return averageTemperature;
	}
	
	
	static int countSunnyDays(ArrayList<Boolean> sunBooleans) {
		int sunnyDays = 0;
		
		
		for (int i = 0 ; i < sunBooleans.size(); i++) {
			if(sunBooleans.get(i) == true) {
				sunnyDays++;
			}
		}
		
		return sunnyDays;
	}
	
	
	static void printWeatherAnalysis(
				ArrayList<Double> temperatures ,
				ArrayList<Boolean> sunBooleans) {
		
		
		int sunnyDays = countSunnyDays(sunBooleans);
		double averageTemperature = averageTemperatures(temperatures);
		
		System.out.println("Weather Analysis");
		System.out.println("--------------------------------------");
		
		
		for( int i = 0 ; i < temperatures.size(); i++ ) {
			System.out.println("Day " + (i+1));
			double tempOnDay = temperatures.get(i);
			boolean sunOnDay = sunBooleans.get(i);
			
			System.out.println("Temp\t: " + tempOnDay);
			System.out.println("Sun\t: " + sunOnDay);
			
			if(tempOnDay > averageTemperature) {
				System.out.println("Above average Temp");
			}
			
			
			System.out.println("--------------------------------------");
			
		}
		
		System.out.println("Overall stats");
		System.out.println("Average temp \t\t: " + averageTemperature);
		System.out.println("Number of days of sun \t: " + sunnyDays);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double tempDay1, tempDay2, tempDay3, tempDay4, tempDay5;
		boolean sunDay1, sunDay2, sunDay3, sunDay4, sunDay5;
		
		tempDay1 = 15.5;
		sunDay1 = true;
		
		tempDay2 = 10.5;
		sunDay2 = false;
		
		tempDay3 = 16.0;
		sunDay3 = true;
		
		tempDay4 = 12.5;
		sunDay4 = true;
		
		tempDay5 = 17.0;
		sunDay5 = false;
		
		ArrayList<Double> temperatures = new ArrayList<Double>();
		
		temperatures.add(tempDay1);
		temperatures.add(tempDay2);
		temperatures.add(tempDay3);
		temperatures.add(tempDay4);
		temperatures.add(tempDay5);
		
		
		ArrayList<Boolean> sunBooleans = new ArrayList<Boolean>();
		
		sunBooleans.add(sunDay1);
		sunBooleans.add(sunDay2);
		sunBooleans.add(sunDay3);
		sunBooleans.add(sunDay4);
		sunBooleans.add(sunDay5);
		
		
		
		printWeatherAnalysis(temperatures, sunBooleans);
		
		
	}

}

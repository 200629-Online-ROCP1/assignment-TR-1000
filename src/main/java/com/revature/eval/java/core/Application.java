package com.revature.eval.java.core;

public class Application {
	
	public static void main(String[] args) {
		shouldWakeUp(true, 24);
		System.out.println(toMilesPerHour(1.5));
		System.out.println(printConversion(1.5));
		
	}
	
	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	
	public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		
		if (isBarking == true && hourOfDay < 8 || hourOfDay > 23) {
			System.out.println("Damn dog woke me up!");
			return true;
		}
		
		else if (isBarking == false) {
			System.out.println("peace and quiet :)");
			return false;
		}
		System.out.println("not night, but shut up anyway!");
		return false;
	}
	
	
	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */
	

	public static long toMilesPerHour(double kilometersPerHour) {
			
		double value = (kilometersPerHour * 0.621371);

		return (long)Math.round(value);
	}

		/**
		 * 1.B Speed Converter - Print Conversion
		 * 
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
	public static String printConversion(double kilometersPerHour) {
			
		return kilometersPerHour + " km/h = YY mi/h " + toMilesPerHour(kilometersPerHour);
	}
		
		
		

	

}

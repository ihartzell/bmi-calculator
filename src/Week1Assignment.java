// For variables use camel case i.e. nextOneToday, for classes Pascal i.e. WeekSeven
// Isaac Hartzell
// January 14,2017
// This program demonstrates a simple BMI calculator.

import java.util.Scanner;
public class Week1Assignment 
{
	public static void main(String[] args) // TODO Auto-generated method stub
	{	
		Scanner input = new Scanner(System.in);
		
		double weight = 0.0;
		double height = 0.0;
		double bmi = 0.0;
		double personalBMI;
		double personalWeight;
		
		// Get user input
		
		System.out.println("How much do you weigh in pounds? ");
		weight = input.nextDouble();
		
		System.out.println("How tall are you in inches? ");
		height = input.nextDouble();
		
		bmi = ((weight * 703) / (height * height));
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("A BMI between 20-24 is considered ideal. "); 
		System.out.println("What would you like your BMI to be? ");
		personalBMI = input.nextDouble();
		
		personalWeight = (personalBMI * height * height) / 703;
		System.out.println("Your weight needs to be " + personalWeight + " pounds for your BMI"); 
		System.out.println("to be " + personalBMI);
	}

}

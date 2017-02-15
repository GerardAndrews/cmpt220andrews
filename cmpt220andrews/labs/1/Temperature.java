/**
File: Temperature.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 1
Due Date: 1/24/2017
Version 1.1
/This file outputs allows the user to input temperature in degrees celcius
and have outputed in degrees Fahrenheit
*/
import java.util.Scanner;  //Importing the Scanner allows the user to use input in a command prompt

public class Termperature {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //This allows users to be able to enter the input.
    System.out.println("Enter a degree in Celcius: ");
    double celcius = input.nextDouble();  
    double fahrenheit = ((9.0 / 5) * celcius + 32);  //This the equation for computing temperature.
    System.out.println(celcius + " degrees Celcius is " + fahrenheit + " Fahrenheit.");
  }
}

    
    
    
    

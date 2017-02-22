/**
File: TempConvert.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 4
Due Date: 2/28/2017
Version 1.0
/This file has a class that contains two methods that convert temperatures
between fahrenheit and celcius
*/
public class TempConvert {
  public static void main(String[] args){
    //Create the table
    System.out.println(
	"Celsius     Fahrenheit     |     Fahrenheit     Celsius\n" +
	"----------------------------------------------------------");
    //Set a for loop so that it will print out the temperature coversion until it hits 
    //both temperature limits to the bottom of the requested display.
    for (double celcius = 40.0, fahrenheit = 104.0; celcius >= 31.0; celcius--, fahrenheit -= 10) {
      //Make sure the table is formatted apporpritely and invoke both methods after calling,
      //the initial temperatures to see the converts
      System.out.printf("%-13.1f", celcius);
      System.out.printf("%-15.1f|     ", celciusToFahrenheit(celcius));
      System.out.printf("%-17.1f", fahrenheit);
      System.out.printf("%-9.2f\n\n", fahrenheitToCelcius(fahrenheit));
    }
    }
    //create a method for celcius to fahrenheit etc. that returns
    //the converting equation
    public static double celciusToFahrenheit( double celcius) {
      return (9.0 / 5) * celcius + 32;
    }
    public static double fahrenheitToCelcius(double fahrenheit) {
      return (5.0 / 9) * (fahrenheit - 32);
  }
}
    
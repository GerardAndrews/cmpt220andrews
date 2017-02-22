/**
File: SmallestNum.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 4
Due Date: 2/28/2017
Version 1.0
/This file has a class that contains two methods that convert temperatures
between fahrenheit and celcius
*/
import java.util.Scanner;

public class SmallestNum {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Create a list of inputs.
    double[] inputList = new double[10];
    //prompt the user to enter 10 numbers for the list.
    System.out.println("print a list of 10 numbers: ");
    for (int i = 0; i < inputList.length; i++) {
      inputList[i] = input.nextDouble();
    }
    System.out.println("The minimum number is: " + min(inputList) + ".");
    }
    //Create a method that searches for the smalllest number.
  public static double min(double[] array){
    double min = array[0];	//The minimum value
    for (double i: array) {
      if (i < min)
      min = i;
    }
    return min;
  }
}

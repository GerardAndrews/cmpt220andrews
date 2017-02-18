/**
File: DigitSumMethod.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 3
Due Date: 2/21/2017
Version 1.0
/This file uses a method that computes the sum of the digits
in an integer.
*/
import java.util.Scanner;

public class DigitSumMethod {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	// Prompt the user to enter an integer
	System.out.print("Enter a integer: ");
	long number = input.nextLong();
	// Display the sum of all the digits in the integer
	System.out.println("The sum of the digits in " + number + " is " +
	sumDigits(number));
	}
	//Compute the sum of the digits in an integer
	public static long sumDigits(long n) {
	  int sum = 0;
	  while (n > 0) {
	    sum += n % 10;
	    n /= 10;
	}
	return sum;
  }
}
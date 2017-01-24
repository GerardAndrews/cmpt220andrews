/**
File: Problem2_5.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 1
Due Date: 1/24/2017
Version 1.3
/This file allows the user to input a number and get the subtotal and gratuity of it
*/
import java.util.Scanner;

public class Problem2_5{
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  System.out.println("Enter the subtotal: ");
	  double subtotal = input.nextDouble();
	  
	  System.out.println("Enter the gratuity rate: ");
	  double gratuityrate = input.nextDouble();
	  
	  //Multiplying the subtotal and gratuity will give you the gratuity.
	  double gratuity = subtotal * gratuityrate / 100;
	  //Adding subtotal and the gratuity then gives you the total
	  double total = subtotal + gratuity;
	  
	  System.out.println("The gratuity is" + gratuity + 
	  " and the total is " + total + " .");
	}
}
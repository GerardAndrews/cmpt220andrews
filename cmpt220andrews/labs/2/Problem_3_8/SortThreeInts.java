/**
File: SortThreeInts.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 1
Due Date: 2/7/2017
Version 1.0
/This file prompts the user to enter three integers, 
and then displays them in non-decreasing order
*/
import java.util.Scanner;

public class SortThreeInts {
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter three integers");
	System.out.println("First Int: ");
	int num1 = input.nextInt();
	System.out.println("Second Int: ");
	int num2 = input.nextInt();
	System.out.println("Third Int: ");
	int num3 = input.nextInt();
	//After inputing the integers, they must now be sorted with if statements
	int temp;
	if (num2 < num1 || num3 < num1) {
	  if (num2 < num1) {
		temp = num1;
		num1 = num2;
		num2 = temp;
	  }
	  if (num3 < num1) {
		temp = num1;
		num1 = num3;
		num2 = temp;
	  }
	}
	if (num3 < num2) {
	  temp = num2;
	  num2 = num3;
	  num3 = temp;
	}	
	System.out.println(num1 + ", " + num2 + ", " + num3);
  }
}  
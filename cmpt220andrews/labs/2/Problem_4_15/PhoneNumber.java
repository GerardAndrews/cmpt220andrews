/**
File: PhoneNumber.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
This file prompts the user to enter an integer,
which is converted into a character 
which correponds to a number on a telephone.
*/
import java.util.Scanner;

public class PhoneNumber {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input a letter: ");
    String letter = input.nextLine();
    char phone = letter.charAt(0);
    phone = Character.toUpperCase(phone);
    //Display a corresponding number
    int number = 0;
    if (Character.isLetter(phone)) {
      if (phone >= 'W') {
        number = 9;
	  }
      else if (phone >= 'T') {
        number = 8;
	  }
      else if (phone >= 'P') {
        number = 7;
	  }
      else if (phone >= 'M') {
        number = 6;
	  }
      else if (phone >= 'J') {
        number = 5;
	  }
      else if (phone >= 'G') {
        number = 4;
	  }
      else if (phone >= 'D') {
        number = 3;
	  }
      else if (phone >= 'A') {
        number = 2;
	  }
	System.out.println("The corresponding number is " + number); 
	}      
      else {
        System.out.println(phone + " is an invalid input");
    }
  }
}

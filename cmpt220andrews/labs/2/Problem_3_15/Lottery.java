/**
File: Lottery.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
/This file prompts the user to enter a three digit number.
/Determines whether the user wins according to the rules.
*/
import java.util.Scanner;

public class Lottery {
  public static void main(String[] args){
    int lottery = (int)(Math.random() * 100);
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a three digit number: ");
    int guess = input.nextInt();
    //Get the random generated digits
    int lotDigit1 = lottery / 10;
    int lotDigit2 = lottery % 10;
    //Get the guessed digits
    int guessDigit1 = guess / 10;
    int guessDigit2 = guess % 10;
    //create a variable to store a number to decide conditions.
    int temp; 
    if (guess == lottery) 
      temp = 1;
    else if (guessDigit2 == lotDigit1 && guessDigit2 == lotDigit2)
      temp = 2;
    else if (guessDigit1 == lotDigit1 || guessDigit2 == lotDigit2 || guessDigit2 == lotDigit1 
             || guessDigit1 == lotDigit2)
      temp = 3;
    else
      temp = 4;
    //Use switch to see which case it is under.
    switch (temp) {
      case 1: System.out.println("Exact match: you win $10,000.");
        break;
      case 2: System.out.println("Match all digits: you win $3,000.");	  
	    break;
      case 3: System.out.println("Match one digit: you win $1,000.");
        break;
      case 4: System.out.println("Sorry, no match.");
	    break;
    }
  }
}

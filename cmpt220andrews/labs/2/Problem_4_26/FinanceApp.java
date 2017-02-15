/**
File: FinanceApp.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
This file generates a vehicle plate by generating 3 uppercase letters
followed by 4 digits.
*/
import java.util.Scanner;

public class FinanceApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount, for example 11.56: ");
    String amount = input.nextLine();
    // Extract number of dollars
    String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));
    // Extract cents
    int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
    //Find the number of quarters
    int numberOfQuarters = cents / 25;
    cents %= 25;
    //Find the number of dimes
    int numberOfDimes = cents / 10;
    cents %= 10;
    //Find the number of nickels
    int numberOfNickels = cents / 5;
    cents %= 5;
    //Display results
    System.out.println("Your amount " + amount + " consists of\n " 
    + numberOfOneDollars + " dollars\n " 
    + numberOfQuarters + " quarters\n "
    + numberOfDimes + " dimes\n "
    + numberOfNickels + " nickels\n "
    + cents + " pennies\n ");
  }
}

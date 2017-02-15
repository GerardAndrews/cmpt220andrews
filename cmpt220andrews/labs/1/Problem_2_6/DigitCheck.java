/**
File: DigitCheckjava
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 1
Due Date: 1/24/2017
Version 1.0
/This file allows the user to input a number and check it's sum of digits.
*/
import java.util.Scanner;

public class DigitCheck {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 1000: ");
    int integer = input.nextInt();
    int digitOne = integer % 10;  //checks the first contant for remainders
    int extractOne = integer / 10;  //Divides the digit by 10 to extract the remainder
    int digitTwo = extractOne % 10;  //checks the second contant for remainders
    int extractTwo = extractOne / 10;
    int digitThree = extractTwo % 10;  //checks the third contant for remainders
    int extractThree = extractTwo / 10;
    int digitFour = extractThree % 10;  //checks the first contant for remainders no extract.
    int sum = digitOne + digitTwo + digitThree + digitFour; 
    //computes the sum of all extracted digits
    System.out.println("The sum of the digits is: " + sum + ".");
  }
}

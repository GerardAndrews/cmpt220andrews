/**
File: PalindromeMethod.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 3
Due Date: 2/21/2017
Version 1.0
/This file uses a method that computes the sum of the digits
in an integer.
*/
import java.util.Scanner;

public class PalindromeMethod {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    //Report whether the integer is a palindrome.
    System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
    "a palindrome.");
    }
    //Method isPalindrome returns true if number is a palindrome
    public static boolean isPalindrome(int number) {
      return number == reverse(number) ? true : false;
    }
    //Method reverse returns the reversal of an integer
    public static int reverse(int number) {
      //Holds reversed number
      String reverse = ""; 	
      //Convert number to string
      String n = number + "";
    //Reverse string
      for (int i = n.length() - 1; i >= 0; i--) {
        reverse += n.charAt(i);
    }
    // Return reversed integer
    return Integer.parseInt(reverse);
  }
}

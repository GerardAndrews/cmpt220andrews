/**
File: Ascii.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
This file prompts the user to enter an int between 0 and 127 
and displays its ascii character
*/
import java.util.Scanner;

public class Ascii {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 127/ASCII code: ");
    int asciiNum = input.nextInt(); 
    //Now we need to just display the number in ascii code form by print (char)variablename
    System.out.println("The character for Ascii code " + asciiNum + " is " + (char)asciiNum);
  }
}  

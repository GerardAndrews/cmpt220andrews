/**
File: PlateNum.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
This file generates a vehicle plate by generating 3 uppercase letters
followed by 4 digits.
*/

public class PlateNum {
  public static void main(String[] args){
    //Generate three random uppercase letters
    int letter1 = 65 + (int)(Math.random() * (90 - 65));
    int letter2 = 65 + (int)(Math.random() * (90 - 65));
    int letter3 = 65 + (int)(Math.random() * (90 - 65));	
    //Generate four random digits
    int num1 = (int)(Math.random() * 10);
    int num2 = (int)(Math.random() * 10);
    int num3 = (int)(Math.random() * 10);
    int num4 = (int)(Math.random() * 10);
    //Display number plate
    System.out.println("" + (char)(letter1) + ((char)(letter2)) + 
    ((char)(letter3)) + num1 + num2 + num3 + num4);
  }
}

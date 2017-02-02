/**
File: RandomMonth.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
/This file outputs: A number between 1 and 12 to represent a month
/also outputs the month name based on the number
*/

public class RandomMonth {
  public static void main(String[] args){
    //Start by generating a number between 1 & 12, display the number itself.
    int monthNum = (int)((Math.random() * 12) + 1);
    System.out.println("Number is: " + monthNum);
    //Use if and else if statements to decide what is outputed by determining the number then break  
    if (monthNum == 1)
      System.out.println("January");
    else if (monthNum == 2)
      System.out.println("February");
    else if (monthNum == 3)
      System.out.println("March");
    else if (monthNum == 4)
      System.out.println("April");
    else if (monthNum == 5)
      System.out.println("May");
    else if (monthNum == 6)
      System.out.println("June");
    else if (monthNum == 7)
      System.out.println("July");
    else if (monthNum == 8)
      System.out.println("August");
    else if (monthNum == 9)
      System.out.println("Septemeber");
    else if (monthNum == 10)
      System.out.println("October");
    else if (monthNum == 11)
      System.out.println("November");
    else
      System.out.println("December");
  }
}

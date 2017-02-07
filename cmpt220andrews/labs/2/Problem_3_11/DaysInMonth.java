/**
File: DaysInMonth.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
/This file prompts the user to enter a month integer and a year integer,
file then switches through cases displaying of days of the month in that year.
*/
import java.util.Scanner;

public class DaysInMonth {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the month as a number between 1 and 12: ");
    int month = input.nextInt();
    System.out.println("Enter a year number: ");
    int year = input.nextInt();
    //Leapyear is a factor here for determining February specifically,
    //So it's important to determine if it's true or not.
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    switch (month) {
      case 1: System.out.println("January, " + year + " has/had 31 days"); 
      break;
      case 2: System.out.println("February, " + year + " has/had" + 
        ((isLeapYear) ?  " 29 days" : "28 days")); 
        break;
      case 3: System.out.println("March, " + year + " has/had 31 days"); 
        break;
      case 4: System.out.println("April, " + year + " has/had 30 days");
        break;
      case 5: System.out.println("May, " + year + " has/had 31 days");
        break;
      case 6: System.out.println("June, " + year + " has/had 30 days");
        break;
      case 7: System.out.println("July, " + year + " has/had 31 days"); 
        break;
      case 8: System.out.println("August, " + year + " has/had days");
        break;
      case 9: System.out.println("September, " + year + " has/had 30 days");   	 
	break;
      case 10: System.out.println("October, " + year + " has/had 31 days");
	break;
      case 11: System.out.println("November, " + year + " has/had 30 days");
        break;
      case 12: System.out.println("December, " + year + " has/had 31 days");
        break;
    }
  }
}
	

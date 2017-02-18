/**
File: FinanceForLoop.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 3
Due Date: 2/21/2017
Version 1.0
/This file computes a specific tuition amount over 10 years and the total cost in 4 years.
*/
import java.util.Scanner;

public class FinanceForLoop {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int totalCost = 0;
    int tuition = 10000;
    int tuitionTenthYear = 0;
    for (int year = 1; year <= 14; year++) {
    //Increase tution by 5% every year
      tuition += (tuition * 0.05);  
    if (year > 10)
      totalCost += tuition;
    //Cost of tution in ten years
    if (year == 10)
      tuitionTenthYear = tuition;    	
    }
      //Display the cost of tution in ten years
      System.out.println("Tuition in ten years: $" + tuitionTenthYear +".");
      //Display the cost of four years' worth of tution after tenth year
      System.out.println("Total cost for four years' worth of tuition" +
      " after the tenth year: $" + totalCost);
  }
}

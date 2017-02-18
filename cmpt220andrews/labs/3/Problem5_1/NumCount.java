/**
File: NumCount.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
/This file prompts the user to enter an unspecified number of integers,
determines how many are positive and negative and computes the total and average of the input values,
(This does not count 0) if the input is 0, the program ends.
*/
import java.util.Scanner;

public class NumCount {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //We need to set variables for positive, negative ints, and total and average calculations.
    int positives = 0;
    int negatives = 0;
    double total = 0;
    int count = 0;
    int num = 0;
   //Now we need a do statement that executes the input
    do {
      System.out.println("Enter an input, (ends if it is 0): ");
      num = input.nextInt();
      if (num == 0) {
	  System.out.println("Program will now end, 0 was inputed.");
	  break;
    }
      else if (num > 0) {
        positives++;
    }
      else {
        negatives++;
    }
      total += num;
      count++;
      continue;
    } while (num != 0); 
       //Now we calculate the average. & Display results
       double average = total/count;
       System.out.println("Number of positives is: " + positives + 
       " The number of negatives is: " + negatives +
       " The count is: " + count + " And the average is: " + average +"."); 
  }  
}
	
	

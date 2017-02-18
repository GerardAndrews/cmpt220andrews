/**
File: NSquared.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 3
Due Date: 2/21/2017
Version 1.0
/This file uses a while loop to find the smallest integer n such that n^2 = 12,000
*/
import java.util.Scanner;

public class NSquared {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int n = 0;	// Start n at 0
	// Find the smallest n such that n^2 > 12,000
	while (Math.pow(n, 2) <= 12000) {
	  // Increment n
	  n++;
	}
	// Display result
	System.out.println("The smallest integer n such that n^2 is greater than 12,000: " + n);
  }
}
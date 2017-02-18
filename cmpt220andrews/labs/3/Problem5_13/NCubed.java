/**
File: NCubed.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 3
Due Date: 2/21/2017
Version 1.0
/This file uses a while loop to find the smallest integer n such that n^3 = 12,000
*/
public class NCubed {
  public static void main(String[] args){
	int n = 0; 	// Intialize n at 0;
	//Find the largest n such that n^3 is < 12,000
	while (Math.pow(n + 1, 3) < 12000) {
	  //Increment n
	  n++; 		
	}
	//Display result
	System.out.println(
	"Largest integer n such that n^3 is less than 12,000: " + n);
  }
}
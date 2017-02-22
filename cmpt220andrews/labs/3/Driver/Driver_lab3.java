/**
File: Driver_lab3.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 3
Due Date: 2/21/2017
Version 1.0
/This file computes the p-norm distance between pairs of points,
for a given value of p.
*/
import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    while (true) {
	  double x1 = scan.nextDouble();
	  if (x1 == 0)
		break;
	  double y1 = input.nextDouble();
	  double x2 = input.nextDouble();
	  double y2 = input.nextDouble();
	  double p = input.nextDouble();
	  System.out.printf( "%.10f" , Math.pow(Math.pow(Math.abs(x1 - x2) , p) + Math.pow(Math.abs(y1 - y2), p), 1 / p));
	  System.out.println();
    }
    input.close();
  }
}
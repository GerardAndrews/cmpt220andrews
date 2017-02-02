/**
File: PolygonArea.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
/This file prompts the user to enter the lenght from the center of a pentagon vertex
and computes the area of a pentagon, as shown in the following figure
*/
import java.util.Scanner;

public class PolygonArea {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of sides: ");
	double n = input.nextDouble();
	System.out.println("Enter the side length: ");
	double s = input.nextDouble();
	double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
	System.out.println("The area of the polygon is: " + area);
  }
}
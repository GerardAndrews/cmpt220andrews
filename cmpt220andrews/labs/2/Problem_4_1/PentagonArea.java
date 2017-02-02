/**
File: PentagonArea.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
/This file prompts the user to enter the lenght from the center of a pentagon vertex
and computes the area of a pentagon, as shown in the following figure
*/
import java.util.Scanner;

public class PentagonArea {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	System.out.println("Enter the length from the center to the vertex: ");
	double vertex = input.nextDouble();
	//We need to put the calculation for the lenght of a side before we put in the calculation
	//for area.
	double s = (2 * vertex) * Math.sin(Math.PI / 5);
	double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
	System.out.println("The area of the pentagon is: " + area);
  }
}
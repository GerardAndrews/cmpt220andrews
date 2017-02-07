/**
File: GradeCalcuation.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
/This file prompts the user to enter the 4 grades based on Software Dev I Grade rubric 
and gives a Letter grade
*/
import java.util.Scanner;

public class GradeCalculation {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	System.out.println("Please enter the following as a percentage: ");
    System.out.println("Midterm Grade: ");
    //Takes the midterm grade input and divides with percentage weight of our sd1 grade rubric
    double midterm = input.nextDouble() * 0.2;  
    System.out.println("Final Test Grade: ");
    //Takes the midterm grade input and divides with percentage weight of our sd1 grade rubric
    double finalTest = input.nextDouble() * 0.2;
    System.out.println("Project Grade: ");
    //Takes the midterm grade input and divides with percentage weight of our sd1 grade rubric
    double projects = input.nextDouble() * 0.2;
    System.out.println("Homework and Labs: ");
    //Takes the hw and labs grade input and divides with percentage weight of our sd1 grade rubric
    double hwLabs = input.nextDouble() * 0.4;
    double finalGrade = (midterm + finalTest + projects + hwLabs);
	System.out.println("Percentage Grade is " + finalGrade + ".");
	if (finalGrade >= 95.0) 
		System.out.println("Your letter Grade is an A");
	else if (finalGrade >= 90.0) 
		System.out.println("Your letter Grade is an A-");
	else if (finalGrade >= 87.0) 
		System.out.println("Your letter Grade is a B+");
	else if (finalGrade >= 83.0) 
		System.out.println("Your letter Grade is a B");
	else if (finalGrade >= 80.0) 
		System.out.println("Your letter Grade is a B-");
	else if (finalGrade >= 77.0)
		System.out.println("Your letter Grade is a C+");
	else if (finalGrade >= 73.0) 
		System.out.println("Your letter Grade is a C");
	else if (finalGrade >= 70.0) 
		System.out.println("Your letter Grade is a C-");
	else if (finalGrade >= 65.0) 
		System.out.println("Your letter Grade is a D+");
	else if (finalGrade >= 60.0) 
		System.out.println("Your letter Grade is a D");
	else 
		System.out.println("Your letter Grade is an F");
	
  }
}
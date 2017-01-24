/**
File: LabStep_2.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 1
Due Date: 1/24/2017
Version 1.0
/This file allows the user to input 4 grade rubrics of the software development 1 class
and output the final grade of the course with the grade weight of the class.
*/
import java.util.Scanner;

public class LabStep_2{
	public static void main(String[] args) {
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
	  //This combines all grades that have attuned to the percentages of the ad1 class grade rubric
	  System.out.println("Your final grade is " + finalGrade +"%.");
	}
}
/**
File: Birthday.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 2
Due Date: 2/7/2017
Version 1.0
This file prompts the user to Y (Yes) or N (No)
Then determines based on the characters what the user's birthday is.
*/
import java.util.Scanner;

public class Birthday {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	//Set up the strings for birthday sets
	String set1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31"; 
	String set2 = " 2  3  6  7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";
	String set3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";
	String set4 = " 8  9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";
	String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";
	int day = 0;
	//Prompt the user to answer set 1
	System.out.print("Is your birthday in Set1?\n");
	System.out.print(set1);
	System.out.print("\nEnter Y for Yes and N for No: ");
	//Setup a string that takes in a character from string input.
	String s = input.nextLine();
	char answer = s.charAt(0);
	if (Character.toUpperCase(answer) == 'Y')
	  day += 1;
	//Prompt the user to answer set 2
	System.out.print("Is your birthday in Set2?\n");
	System.out.print(set2);
	System.out.print("\nEnter Y for Yes and N for No: ");
	s = input.nextLine();
	answer = s.charAt(0);
	if (Character.toUpperCase(answer) == 'Y')
	  day += 2;
	// Prompt the user to answer set 3
	System.out.print("Is your birthday in Set3?\n");
	System.out.print(set3);
	System.out.print("\nEnter Y for Yes and N for No: ");
	s = input.nextLine();
	answer = s.charAt(0);
	if (Character.toUpperCase(answer) == 'Y')
	  day += 4;
	// Prompt the user to answer set 4
	System.out.print("Is your birthday in Set4?\n");
	System.out.print(set4);
	System.out.print("\nEnter Y for Yes and N for No: ");
	s = input.nextLine();
	answer = s.charAt(0);
	if (Character.toUpperCase(answer) == 'Y')
	  day += 8;
	// Prompt the user to answer set 5
	System.out.print("Is your birthday in Set5?\n");
	System.out.print(set5);
	System.out.print("\nEnter Y for Yes and N for No: ");
	s = input.nextLine();
	answer = s.charAt(0);
	if (Character.toUpperCase(answer) == 'Y')
	  day += 16;
    //Print Final calculation.
	System.out.println("\nYour birthday is " + day + "!");
	}
}
/*
File: Selectionsort.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 5
Due Date: 3/28/2017
Version 1.0
/This file prompts the user to input the size and and numbers of two vectors (arrays)
The vectors then go through the function which convolutes both vectors.
*/
import java.util.Scanner;

public class Selectionsort {
  public static void main(String[] args) {
    //Create a scanner  
    Scanner input = new Scanner(System.in);
    //Create a list of numbers and prompt the user to enter 10 numbers.
    System.out.println("Enter 10 Numbers: ");
    double[] numList = new double[10];
    for (int i = 0; i < numList.length ; i++)
      numList[i] = input.nextDouble();
    //Invoke the Selectionsort method to sort the array.
    selectionSort(numList);
    //Display the result
    for (double e: numList) 
      System.out.println("Here are the sorted numbers: ");
	  System.out.print(e + " ");
  }
  //Create a method called selectionsort which will sort the numbers
  //by finding the largest number and swapping it with last
  public static void selectionSort(double[] list) {
	for (int i = list.length - 1; i >= 0; i--) {
	// Find the maximum in the list[i+1...list.length]
    double currentMax = list[i];
    int currentMaxIndex = i;
    for (int x = i - 1; x >= 0; x--) {
      if (currentMax < list[x]) {
        currentMax = list[x];
        currentMaxIndex = x;
        }
      }
    // Swap list[i] with list[currentMax] if necessary
    if (currentMaxIndex != i) {
      list[currentMaxIndex] = list[i];
      list[i] = currentMax;
      }
    }
  }
}
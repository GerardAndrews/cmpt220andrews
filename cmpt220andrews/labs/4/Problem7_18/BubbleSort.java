/**
File: BubbleSort.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 4
Due Date: 2/28/2017
Version 1.0
/This file prompts the user to input an  array of 10 numbers,
the array then goes through the bubblesort technique
this is done by going through the array multiple times
sorting the numbers that are next to each other from smaller to bigger.
*/
import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //create an array of 10 random numbers
    double[] inputList = new double[10];
    //prompt the user to enter 10 numbers
    System.out.println("print a list of 10 numbers: ");
    for (int i = 0; i < inputList.length; i++) {
      inputList[i] = input.nextDouble();
    }
    //invoke the bubblesort method
    bubbleSort(inputList);
    //Now display the numbers
    for (double x: inputList) {
      System.out.print(x + " ");
    }
      System.out.println();
    }
  public static void bubbleSort(double[] list) {
    //create a temporary value for sorting,
    //and then boolean to confirm a sorting happened.
    double temp;
    boolean sort;
    //create a do-while loop to sort the number first, then return the boolean
    do {
      sort = false;
      /*use a for loop to go through the list,
      if a variable in the list is less than the variable next to it
      then switch that variable to the temporary value 
      and then swap the other value to the previous holder
      swap the boolean to true, then rinse & repeat.
      */
      for(int i = 0; i < list.length - 1; i++) {
        if (list[i] > list[i + 1]) {
          temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;
          sort = true;
        }
      }
    } while(sort);
  }
}
/*
File: Partition.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 5
Due Date: 3/28/2017
Version 1.0
/This file prompts the user to input two lists
The lists are then sorted into lowest to highest number.
*/
import java.util.Scanner;

public class Partition {
  public static void main(String[] args) {
    //Create a scanner  
    Scanner input = new Scanner(System.in);
    //Create a lists and prompt the user to enter numbers into each list.
    System.out.println("Enter list1: ");
    int[] list = new int[9];
    for (int i = 0; i < list.length; i++) {
      list[i] = input.nextInt();
    }
    //Use the partition method
    partition(list);
    //Display the results
    System.out.println("After the partition, the list is: ");
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }
  }
  //Create a partition method
  public static int partition (int[] list) {
    //Have a variable for the first, low, high numbers.
    int first = 0;
    int low = first + 1;
    int high = list.length - 1;
    //pivot will usually mean the central or middle number
    int pivot = list[first];
    //Setup up a while loop to distinguish the variables from each other
    while (high > low) {
      //Setup two other loops to distinguish them even further
      while (low <= high && list[low] <= pivot) low++;
      while (low <= high && list[high] > pivot) high--;
      //If the number is higher than the lower number,
      //Place it into a list of either high or low number list.
      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }
    //Setup a while loop that will decrease the value of high.
    while (high >= low && list[high] >= pivot) high--;
    //If a number is greater than the first place into the list of high numbers
      if (high > first) {
        int temp = list[high];
        list[high] = list[first];
        list[first] = temp;
        return high;
      } 
      else {
      return first;
    }
  }
}
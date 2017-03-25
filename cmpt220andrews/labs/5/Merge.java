/*
File: Merge.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 5
Due Date: 3/28/2017
Version 1.0
/This file prompts the user to input the size and and numbers of two vectors (arrays)
The vectors then go through the function which convolutes both vectors.
*/
import java.util.Scanner;

public class Merge {
  public static void main(String[] args) {
    //Create a scanner  
    Scanner input = new Scanner(System.in);
    //Create two lists and prompt the user to enter numbers into each list.
    System.out.println("Enter list1: ");
    int[] list1 = new int[6];
    for (int i = 0; i < list1.length; i++) {
      list1[i] = input.nextInt();
    }
    System.out.println("Enter list2: ");
    int[] list2 = new int[5];
    for (int i = 0; i < list2.length; i++) {
      list2[i] = input.nextInt();
    }
    //Merge the lists with the merge method
    int[] list3 = merge(list1, list2);
    // Display the merged list
    System.out.print("The merged list is: ");
    for (int e: list3) {
      System.out.print(" " + e);
    }
    System.out.println();
  }
  public static int[] merge (int[] list1, int[] list2) {
    int[] list3 = new int[list1.length + list2.length];
	for (int i = 0; i < list1.length; i++)
      list3[i] = list1[i];
    for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
      list3[j] = list2[i];	
	}
    sort(list3);
    return list3;
  }
  public static void sort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      int min = list[i];
      int minIndex = i;
    for (int j = i + 1; j < list.length; j++) {
      if (list[j] < min) {
        min = list[j];
        minIndex = j; 
      }					
    }
    if (minIndex != i) {
      list[minIndex] = list[i];
      list[i] = min;
      }
    }
  }
}
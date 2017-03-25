/*
File: Driver_proj1.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Project 1
Due Date: 3/28/2017
Version 1.0
/This file prompts the user to input the size and and numbers of two vectors (arrays)
The vectors then go through the function which convolutes both vectors.
*/
import java.util.Scanner;

public class Driver_proj1 {
  public static void main(String[] args) {
    //Create a scanner  
    Scanner input = new Scanner(System.in);
    //Create two arrays for representing two vectors, and prompt the user to
    //enter the size of both vectors
    System.out.println("Please enter the size of the first vector: ");
    int input = input.nextInt();
    double[] array = new double[input];
    System.out.println("Please enter the size of the 2nd vector: ");
    input = input.nextInt();
    //Prompt the user to enter the numbers for both vectors
    System.out.println("Please enter the elements of the 1st vector: ");
    for (int vFirst = 0; vFirst < array.length; vFirst++){
      array[vFirst] = input.nextDouble();
    }
    System.out.println("Please enter the elements of the 2nd vector: ");
    double[] array2 = new double[input];
    for (int vSecond = 0; vSecond < array2.length; vSecond++){
      array2[vSecond] = input.nextDouble();
    }
    //The result will be calculated with a separate function that uses
    //convolution.
    double[] vResult = convolveVectors(array, array2);
    for (int vFirst = 0; vFirst < vResult.length; vFirst++){
      System.out.print((int) vResult[vFirst] + " ");
    }
  }
  //Create a separate function that will use the convolution function
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    //The vResult will be set here and and set equal to the sum of both vectors
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    //cResult will be used to shift the second vector until it hits the value of vResult.
    for (int cResult = 0; cResult < vResult.length; cResult++){
      vResult[cResult] = 0;
    //Setup a for loop to keep track of how much the second vector shifts
    for (int shift = 0; shift < 51; shift++){
      double sum = 0;
      //if the difference between cResult & shift = 0 & is less than the the vector's length
      if (cResult - shift >= 0 && cResult - shift < vFirst.length){
        //If it's less than the second vector's length  
        if (cResult >= 0 && cResult < vSecond.length)
        //set the sum to what the first vector's difference multipled by
        //The second vector
        sum = (vFirst[cResult - shift] * vSecond[shift]);
        }
        //Return the result to give the answer
        vResult[cResult] += sum;
      }
    }
    return vResult; 
  }
}
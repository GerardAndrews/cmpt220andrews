import java.util.Scanner;
import java.io.*;
 
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
  }
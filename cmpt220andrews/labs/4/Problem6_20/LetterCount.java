/**
File: LetterCount.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 4
Due Date: 2/28/2017
Version 1.0
/This file has a class that contains two methods that convert temperatures
between fahrenheit and celcius
*/
import java.util.Scanner;

public class LetterCount {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //prompt the user to enter a string
    System.out.println("Enter a string, whatever you wish it to be: ");
    String string = input.nextLine();
    //Display number of letters and invoke the method
    System.out.println("The number of letters in the of '"+ string + "' is: " + countLetters(string) +".");
  }
  public static int countLetters(String s) {
    int letterNumber = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i)))
        letterNumber++;
  }
    return letterNumber;
  }
}

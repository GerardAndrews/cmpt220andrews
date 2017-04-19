/*
File: UseBMIClass.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 7
Due Date: TBA
Version 1.0
This file checks the BMI of two pre-set examples using the BMI class file.
*/

public class UseBMIClass {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);
    System.out.println("The BMI for " + bmi1.getName() + " is "
      + bmi1.getBMI() + " " + bmi1.getStatus() + ".");
    BMI bmi2 = new BMI("Susan King", 210, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is "
      + bmi2.getBMI() + " " + bmi2.getStatus() + ".");
  }
}
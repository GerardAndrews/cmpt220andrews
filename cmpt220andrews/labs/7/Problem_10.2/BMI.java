/*
File: BMI.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 7
Due Date: 4/25/2017
Version 1.0
This file contains a class for BMI that checks for age, 
weight, height, feet, and inches and returns it.
*/

/*________________________*
*           BMI           *
*_________________________*
*-name: String            *
*-age: int                *
*-weight: double          *
*-height: double          *
*-feet: double            *
*-inches: double          *
*_________________________*
*+BMI(name: String, age:  *
*int, weight: double,     *
* height: double)         *
*                         *
+BMI(name: String,        *
*weight: double,          *
*height: double)          *
*                         *
*+getBMI(): double        *
*+getBMI(): double        *
*_________________________*/

public class BMI {
  private String name;
  private int age;
  private double weight;
  private double height;
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;
  public static final int INCHES_PER_FOOT = 12;
  public BMI(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }
  public BMI(String name, double weight, double height) {
    this(name, 20, weight, height);
  }
  public BMI(String name, int age, double weight, double feet, double inches) {
    this(name, age, weight, inches + feet * 12);
  }
  public double getBMI() {
    double bmi = weight * KILOGRAMS_PER_POUND /
      ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
    return Math.round(bmi * 100) / 100.0;
  }
  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public double getWeight() {
    return weight;
  }
  public double getHeight() {
    return height;
  }
}
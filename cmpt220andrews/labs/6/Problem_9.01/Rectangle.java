/*
File: Rectangle.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 6
Due Date: 4/18/2017
Version 1.0
This file creates a rectangle class with variables with height and weight variables,
A no-arg constructor that creates a default rectangle,
with two methods that return the area and Perimeter of the rectangle.
*/
import java.util.Scanner;

//UML Class Diagram                     
/*_________________________________________________
*               Rectangle                         *  
* ________________________________________________*  
* width: double                                   *
* height: double                                  * 
* Rectangle()                                     *  
* Rectangle(newWidth: double, newHeight: double)  *
* getArea(): double                               *
* getPerimeter(): double                          *
___________________________________________________*/
public class Rectangle {
  double width;
  double height;
  //A no-arg constructor that creates a default rectangle 
  Rectangle() {
    width = 1;
    height = 1;
	} 
	/*A constructor that creates a rectangle 
	with the specified width and height    */
	Rectangle(double newWidth, double newHeight) {
      width = newWidth;
      height = newHeight;
	}
	//Return the area of this rectangle
	double getArea() {
      return width * height; 
	}
	//Return the perimeter of this rectangle */
	double getPerimeter() {
    return 2 * (width + height);
  }
}
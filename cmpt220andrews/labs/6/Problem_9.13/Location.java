/*
File: Location.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 6
Due Date: 4/18/2017
Version 1.0
This file creates a location class that is set for a two dimensional array
with multiple rows & columns as well as the max value for returning the largest element
*/
//UML Diagram
/*______________________________-*
*           Location           *
*------------------------------*
* +row: int                    *
* +column: int                 *
* +maxValue: double            *
* +Location(array: double[][]) *
_______________________________*/
//Create Location class
public class Location {
//Data fields, one for the row of the maxValue, the column of the maxValue,
//and the max value itself as a double.
  int row;
  int column;
  double maxValue;
  //Constructs a default Loction object .
  Location(double[][] a) {
    maxValue = a[0][0];
    row = 0;
    column = 0;
    for (int i = 0; i < a.length; i++) {
    for (int j = 0; j < a[i].length; j++) {
    if (a[i][j] > maxValue) {
    maxValue = a[i][j];
    row = i;
    column = j;
    }
    }
    }
  }
}
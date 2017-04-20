/*
File: TenSquaredNumbers.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 7
Due Date: 4/25/2017
Version 1.0
This file looks for the first 10 squared numbers
by using a BigInteger.
*/
import java.math.BigInteger;

public class TenSquaredNumbers {
  public static void main(String[] args) {
    // Find the first ten square numbers  
    // that are greater than Long.MAX_VALUE
    BigInteger i = new BigInteger(Long.MAX_VALUE + ""); 
    BigInteger end = i.add(new BigInteger("10"));
    // Display results
    for (i = new BigInteger(Long.MAX_VALUE + ""); 
    i.compareTo(end) <= 0; 
    i = i.add(new BigInteger("1"))) {
    System.out.println(i.multiply(i)); 
    }		
  }
}
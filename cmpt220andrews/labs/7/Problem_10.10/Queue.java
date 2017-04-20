/*
File: Queue.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 7
Due Date: 4/25/2017
Version 1.0
This file .
*/

public class Queue {
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 8;
  //Construct a stack with the default limit of 8.
  public Queue () {
    elements = new int[DEFAULT_CAPACITY];
  }
  //Create a method that adds the variable v into the queue
  public void enqueue(int v) {
    if (size >= elements .length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0 , temp, 0, elements.length);
      elements = temp;
    }
    elements[size++] = v;
  }
  //Create a method that removes the element from the queue and returns it
  public int dequeue() {
    int v = elements[0];
    int[] temp = new int[elements.length];
    System.arraycopy(elements, 1, temp, 0, size);
    elements = temp;
    size--;
    return v;
  }
  //create a method to check if the element is empty and return it.
  public boolean empty() {
    return size == 0;
  }
  //return the size
  public int getSize() {
    return size;
  }
}
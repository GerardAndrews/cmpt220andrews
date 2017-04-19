/*
File: Queue.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Lab 7
Due Date: 4/25/2017
Version 1.0
This file .
*/

public class UseQueueClass {
  public static void main(String[] args) {
    // Create a Queue object
    Queue queue = new Queue();
    // Adds 20 numbers from 1 to 20 into the queue
    for (int i = 1; i <= 20; i++) {
      queue.enqueue(i);
    }
    // Removes these numbers and displays them
    while (!queue.empty()) {
      System.out.print(queue.dequeue() + " ");
      }
    System.out.println();
  }
}
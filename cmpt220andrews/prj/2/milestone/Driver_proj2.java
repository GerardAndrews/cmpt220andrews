/*
File: Drive_proj2.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Project 2
Due Date: TBA
Version 1.7
This file is a text based adventure game where the user inputs a command
The game state then updates and then a scene in rendered.
Basic game rule is that you must collect all 6 items,
The Items are located in 6 of the game's 20 locations, good luck.
*/
import java.util.Scanner;

public class Driver_proj2 {
    //Create variable that keeps track of the player's score.
    public static int score = 0;
    //Create 20 booleans that keep track of whether the player visited them or not.
    public static String[] locScene = new String[] {"You are now in loc1.",
    "You are now in loc2.",
    "You are now in loc3",
    "You are now in loc4",
    "You are now in loc5",
    "You are now in loc6",
    "You are now in loc7",
    "You are now in loc8",
    "You are now in loc9",
    "You are now in loc10"};
    public static boolean[] visLoc = new boolean[]{false, false, false, false, false, false, false, false, false, false};
    public static int currLoc = 0;
  public static void main(String[] args) {
    //Create 20 locations
    int loc1 = 0; //1
    int loc2 = 1; //2
    int loc3 = 2; //3
    int loc4 = 3; //4
    int loc5 = 4; //5
    int loc6 = 5; //6
    int loc7 = 6; //7
    int loc8 = 7; //8
    int loc9 = 8; //9
    int loc10 = 9; //10
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name player: ");
    String name = input.nextLine();
    System.out.println("Welcome to the text adventure! " + name + ".");
    //Initialize the player's starting position here
    currLoc = 0;
    visLoc[1] = true;
    System.out.println("You are in loc1.");
    System.out.println("Your score is, " + score +".");
    //Prompt the user for input
    while (true) {
      System.out.print("Please input a command: ");
      String cmd = input.nextLine();
      //update the game state
      if (cmd.equals ("n")) {
        if (currLoc == loc1) {
          currLoc = loc2;
          updateState(1);
        }
        else if (currLoc == loc4) {
          currLoc = loc5;
          updateState(4);
        }
        else {
          System.out.println("There is nothing in that direction from where you are at.");
          continue;
        }
      }
      else if (cmd.equals ("s")) {
        if (currLoc == loc2) {
          currLoc = loc1;
          updateState(0);
        }
        else if (currLoc == loc5)  {
          currLoc = loc4;
          updateState(3);
        }
        else {
          System.out.println("There is nothing in that direction from where you are at.");
          continue;
        }
      }
      else if (cmd.equals ("e")) {
        if (currLoc == loc3) {
          currLoc = loc1;
          updateState(0);
        }
        else if (currLoc == loc1) {
          currLoc = loc4;
          updateState(3);
        }
        else {
          System.out.println("There is nothing in that direction from where you are at.");
          continue;
        }
    }
      else if (cmd.equals ("w")) {
        if (currLoc == loc4) {
          currLoc = loc1;
          updateState(0);
        }          
        else if (currLoc == loc1) {
          currLoc = loc3;
          updateState(2);
        }
        else {
          System.out.println("There is nothing in that direction from where you are at.");
          continue;
        }
      }
      else if (cmd.equals ("h")) {
        helpDis();
        continue;
      }
      else if (cmd.equals ("p")) {
        System.out.println("Your current score is " + score + " points!");
        continue;
      }
      else if (cmd.equals ("q")) {
        System.out.println("You have quit the game.");
        break;
      }
      else {
        System.out.println("That is not a valid command, help or h for a command list.");
        continue;
      }
    //After the game state is updated, display a scene.
    sceneRender();
    }
    //Insert Copyright claim to the game.
    System.out.println("Copyright 2017 Gerard Andrews All Rights Reserved, gerard.andrews1@marist.edu");
    }
    public static void updateState(int currLoc) {
      if (visLoc[currLoc] == false) {
        visLoc[currLoc] = true; 
        score += 5;
      }
    }
    public static void sceneRender() {
      System.out.println(locScene[currLoc]);
      System.out.println();
    }
    public static void helpDis(){
      System.out.println("Movement Commands: (north or n), (south or s),(west or w)");
      System.out.println("You may also type quit (q) to leave the game.");
      System.out.println();
    }
    public static void endDis() {
      System.out.println("You have beat the game.");
      System.out.println();
    }   
  }
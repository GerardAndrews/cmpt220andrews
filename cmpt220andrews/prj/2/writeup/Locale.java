/*
File: Drive_proj2.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Project 2
Due Date: 5/1/2017
Version 1.0
This file is a class for a locations in the text adventure.
It keeps track of how many locations, the descriptions for each location
and the keeps track of whether the location was visited or not.
*/

/*
*__________________________*
*        Locale            *
*__________________________*
*-locs: int[]              *
*-visLoc: boolean[]        *
*-locScene: String[]       *
*__________________________*
*+Locale(locs: int[],      *
*visLoc: boolean[],        *
*locScene: String[])       *  
*                          *
*+getLocs(): int[]         *
*                          *
*+getVisitedLocs: boolean[]*
*                          *
*+getScenes(): String[]    *
*_________________________ *
*/

public class Locale {
  public int[] locs;
  public boolean[] visLoc;
  public String[] locScene;
  public Locale(int[] locs, boolean[] visLoc, String[] locScene) {
    this.locs = new int[] {0, 1, 2, 3, 4,
    5, 6, 7, 8, 9, 10, 11, 12,
    13, 14, 15, 16, 17, 18, 19};
    this.visLoc = new boolean[]{false, false, false, false, 
    false, false, false, false, false, false, false, false,
    false, false, false, false, false, false, false, false};
    this.locScene = new String[] 
    {"You are now at the entrance of the house.  The door is currently open",
    "You are now in the living room of the house, you can move forward" +
    " or head back?", "You are now in a bedroom, " +
    "the bed has been made but the entire room is dusty" +
    "You can head back to the living room or move west or north. \n",
    "You are now in the baby's room, mostly the play pen is" +
    "in the center of the room as well as a drawer containing clothes, " +
    "you can head back to the living room  or move north and south.",
    "You are now in the piano room, the piano is really dusty" +
    " you can head north or south.", "You are now in the den, there's a giant TV and couch" +
    "There's a room that appears an area that leads south or you can head back",
    "You are now on the second floor, you can head back down, or move north west and south",
    "You are now in the kitchen, there's a fridge, an oven, and a counter with a microwave." +
    " There appears to be a room to the west, you cna also head south, east, and north.", 
    "You are now in the art room, numerous paintings and sculptures stand before you." +
    "You can head back or you can look at the room south of the art room",
    "You are now in on the third floor, more steps await climbing in fornt of you",
    "You are now in on the fourth floor bedroom, you can see the whole town through the window",
    "You are now on hte third floor bedroom, a set of staircases climb even further upward",
    "You are now in the fourth floor bathroom, make sure to flush..." +
    "you cna head back down or go west form here.", "You are now in the main hallway," +
    " you can head back down, left, right, or move north.", "You are now in the weight room" +
    "There are rows upon rows of equipment, however there is nowhere else to go but back.",
    "You are now in a game room, tons and tons of board games and video games but its a dead end.",
    "You are now on a balcony, you take a deep breath as you there's fresh scent in the air.",
    "You are now in the attic, this is mosty storage nothing of relevance here or is there?", 
    "You are now at the end of the main hallway and below you is a door that leads to the room" +
    "that the ball crashed into", "You are now in the master bedroom, you find the" +
    "ball quite easily, it's time to leave, unless there's more to explore."};
  }
  public int[] getLocs() {
    return locs;
  }
  public boolean[] getVisitedLocs() {
    return visLoc;
  }
  public String[] getScenes() {
    return locScene;
  }
}
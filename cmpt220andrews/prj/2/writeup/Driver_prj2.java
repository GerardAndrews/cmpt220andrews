/*
File: Drive_proj2.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Project 2
Due Date: 5/1/2017
Version 2.5
This file is a text based adventure game where the user inputs a command
The game state then updates and then a scene in rendered.
Basic game rule is that you must collect all 6 items,
The Items are located in 6 of the game's 20 locations, good luck.
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Driver_prj2 {
    //Initialize the classes for player, locations, and items
    public static Player player = new Player(50, 0, 0);
    public static Locale locale = new Locale(new int[] {0, 1, 2, 3, 4,
    5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, new boolean[]{false, false, false, false, 
    false, false, false, false, false, false, false, false,
    false, false, false, false, false, false, false, false}, new String[] 
    {"You are now at the entrance of the house.  The door is currently open",
    "You are now in the living room of the house, you can move forward" +
    " or head back?", "You are now in a bedroom, " +
    "the bed has been made but the entire room is dusty" +
    "You can head back to the living room or move west or north. \n",
    "You are now in the baby's room, mostly the play pen is" +
    "in the center of the room as well as a drawer containing clothes, " +
    "you can head back to the entrance or move north and south.",
    "You are now in the piano room, the piano is really dusty" +
    " you can head north or south.", "You are now in the den, there's a giant TV and couch" +
    "There's a room that appears an area that leads south or you can head back",
    "You are now on the second floor, you can head back down, or move north west and south",
    "You are now in the kitchen, there's a fridge, an oven, and a counter with a microwave." +
    " There appears to be a room to the west, you can also head south, east, and north.", 
    "You are now in the art room, numerous paintings and sculptures stand before you." +
    "You can head back or you can look at the room south of the art room",
    "You are now in on the third floor, more steps await climbing in fornt of you",
    "You are now in on the fourth floor bedroom, you can see the whole town through the window",
    "You are now on the third floor bedroom, a set of staircases climb even further upward",
    "You are now in the fourth floor bathroom, make sure to flush..." +
    "you can head back down or go west form here.", "You are now in the main hallway," +
    " you can head back down, left, right, or move north.", "You are now in the weight room" +
    "There are rows upon rows of equipment, however there is nowhere else to go but back.",
    "You are now in a game room, tons and tons of board games and video games but its a dead end.",
    "You are now on a balcony, you take a deep breath as you there's fresh scent in the air.",
    "You are now in the attic, this is mosty storage nothing of relevance here or is there?", 
    "You are now at the end of the main hallway and below you is a door that leads to the room" +
    "that the ball crashed into", "You are now in the master bedroom, you find the" +
    "ball quite easily, it's time to leave, unless there's more to explore."});
    public static Items items = new Items(new int[] {0, 1, 0, 3, 0, 0, 6, 0, 0, 
    9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new String[] {" ", "Key", " ", "Map", " ", " ", 
    "Lantern", " ", " ", "Radio", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
    new String[] {" ", "Could this be to get to other areas?", " ", "Maybe this can be used to navigate the house better.", " ", " ",
    "Maybe this can be used to make rooms more lit.", " ", " ", "Perhaps this can be used to make things less tense", " ", " ", " ", " ", " ", " ", " ",
    " ", " ", " "});
    //Create 20 booleans that keep track of whether the player visited them or not.
    public static ArrayList<String> inv = new ArrayList<String>();
    /*Create a navigation matrix that contains all the locations
    It will also contain where the player cna go based on where the player is
    and what direction they typed {north, south, east, west}*/
    public static int[][] paths = new int[][] {
     {1, -1, 3, 2}, {6, 0, -1, -1}, {7, -1, 0, 8}, 
     {4, -1, 5, 0}, {13, 3, -1, -1}, {-1, 14, -1, 3},
     {11, 1, 13, 7}, {9, 2, 6, 16}, {-1, 15, 2, -1}, 
     {10, 7, -1, -1}, {-1, 9, 12, -1}, {12, 6, -1, -1}, 
     {-1, 11, -1, 10}, {17, 4, 18, 6}, {5, -1, -1, -1}, 
     {8, -1, -1, -1}, {-1, -1, 7, -1}, {-1, 13, -1, -1}, 
     {-1, 19, -1, 13}, {18, -1, -1, -1}};       
  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    //Prompt the user to enter a name.
    System.out.println("Enter your name player: \n");
    String name = input.nextLine();
    //Display Backstory
    System.out.println("Welcome to this adventure! "+ 
    name + ". You are ten years old and are currently playing baseball with your friends." +
    "You hit a homerun, but the ball hits and breaks the window of an abandoned house." +
    "Knowing that it's the only ball that you and your friends have, you decide to head in," +
    "and find it yourself.  Good luck" + name +"!\n");
    //Initialize the player's starting position here
    player.currLoc = 0;
    int startLoc = 0;
    locale.visLoc[0] = true;
    System.out.println("You are now at the entrance of the house.  The door is currently open.\n");
    //Prompt the user for input
    while (true) {
      System.out.print("Please input a command," + 
      "type h or help if you want to know the commands: \n");
      //Player will enter imput in cmd
      String cmd = input.nextLine();
      //if the player types in caps they will be set lowercase
      cmd = cmd.toLowerCase();
      //update the game state
      if (cmd.equals ("n") || cmd.equals ("north")) {
        updateState(0, player.currLoc);
        }
      else if (cmd.equals ("s") || cmd.equals ("south")) {
        updateState(1, player.currLoc);
      }
      else if (cmd.equals ("e") || cmd.equals("east")) {
        updateState(2, player.currLoc);
        }
      else if (cmd.equals ("w") || cmd.equals ("west")) {
        updateState(3, player.currLoc);
      }
      else if (cmd.equals ("x") || cmd.equals("examine")) {
          
        if (items.itemLoc[player.currLoc] == 0) {
          //If there are no items here print a statement that informs the player of it.
          System.out.println("There are no items here.\n");
          continue;
        }
        else {
          //inform the player there is an item here
          System.out.println("There is a " + items.items[player.currLoc] + " on the floor.\n");
          //print out the item's description
          System.out.println(items.desc[player.currLoc] + "\n");
        }  
      }
      else if (cmd.equals ("t") || cmd.equals("take")) {
        //If there are no items here print a statement that informs the player of it.
        if (items.itemLoc[player.currLoc] == 0) {
        System.out.println("There are no items here.\n");
        continue;
      }
      else {
        for(int i = 0; i < 1; i++){
           //add the item to the inventory
          inv.add(items.items[player.currLoc]);
        }
        //Set the item location to zero so he can't pick up multipe items of the same name
        items.itemLoc[player.currLoc] = 0;
        //Inform the player that he picked up the item
        System.out.println("You have picked up " + items.items[player.currLoc] + ".\n");
        }
      }
      else if (cmd.equals ("h") || cmd.equals("help")) {
        //This will just print out what commands he can do
        helpDis();
        continue;
      }
      else if (cmd.equals("m") || cmd.equals("map")) {
          //The player can view the map only if he has the map in his inventory
        if (mapCheck() == true) {
          mapDisplay();
        }
        else {
          System.out.println("Perhaps " + name + " can find one in the house. \n");
          continue;
        }
      }
      else if (cmd.equals ("p") || cmd.equals ("points")) {
        //Typing p or points displays the player's score variable
        System.out.println(name +"'s current score is " + player.score + " points!\n");
        continue;
      }
      else if (cmd.equals ("i") || cmd.equals ("inventory")) {
        //Typing i displays the player's inventory
        System.out.println(inv + "\n");
        continue;
      }
      else if (cmd.equals ("q") || cmd.equals ("quit")) {
        //typing quit or q breaks the loop and quits the game
        System.out.println("You have quit the game.\n");
        break;
      }
      else {
        System.out.println("That is not a valid command, help or h for a command list.\n");
        continue;
      }
    //After the game state is updated, display a scene.
    sceneRender();
    if (player.currLoc == 19 && inv.size() == 4) {
      System.out.println("You win! \n");
      break;
    }
    else if (player.moves == 0) {
      System.out.println("You have ran out of moves, the game will now end.\n");
      break;
    }
    else {
      continue;
      }
    }
    //Insert Copyright claim to the game.
    System.out.println("Copyright 2017 Gerard Andrews All Rights Reserved, gerard.andrews1@marist.edu");
  }
  public static int getDest (int dirID, int startLoc) {
    /*The destination variable will take in the player's location based on where the player is
    in the navigation matrix as well as what directional input he/she made.
    */
    int dest = paths[startLoc][dirID];
    //If there is nothing in the direction of the player
    if (dest == -1) {
      //the starting location will remain the same
      dest = startLoc;
      //Player will be informed that he cannot go that way.
      System.out.println("There is nothing in that direction.\n");
    }
    //Some locations require specific items to enter such as a key.
    else if (dest == 14 || dest == 15 || dest == 16 || dest == 17 || dest == 19) {
      //If he doesn't have a specific item
      if(itemCheck() == false){
      //He will be informed about it
      System.out.println("This area appears to be locked, perhaps there's a key around./n");
      dest = startLoc;
      }
      //Otherwise he can continue
      else {
        System.out.println("The door opens with the key! /n");
      }
    }
    return dest;
  }
  public static int updateState(int dirID, int currLoc) {
    //Player's current location returned from the destination variable
    player.currLoc = getDest(dirID, currLoc);
    //subtract from how many moves the player can make after directional input is set in
    player.moves -= 1;
    System.out.println("You have " + player.moves + " moves left.\n");
    //Determine whether the player has already visited the location or not
    if (locale.visLoc[player.currLoc] == false) {
      locale.visLoc[player.currLoc] = true; 
      player.score += 5;
    }
    return player.currLoc;
  }
  public static boolean itemCheck() {
    if (inv.contains("Key")) {
      return true;
      }
    else {
      return false;
    }
  }
  public static boolean mapCheck() {
    if (inv.contains("Map")) {
      return true;
      }
    else {
      return false;
    }
  }   
  public static void sceneRender() {
    //print the description based on the player's current location
    System.out.println(locale.locScene[player.currLoc] + "\n");
  }
  public static void helpDis(){
    System.out.println(
    "***************************COMMANDS*******************************\n" +
    "Movement Commands: (north or n), (south or s),(east or e)," +
    "and (west or w)\n" +
    "Typing examine (x) will reveal," +
    "if an item is in your current location. \n" +
    "Typing take (t) will add the item to your inventory," +
    "if it's in the location.\n" +
    "Typing points (p) will show you your current score.\n" +
    "Typing inventory (i) will display your inventory and items. \n" +
    "Typing map (m) will display a text based map, if you have one. \n" +
    "You may also type quit (q) to leave the game.\n" +
    "*****************************HELP*********************************");
  }
  private static void mapDisplay() {
    System.out.println(
    "************************************************************\n" +
    "*          Bedroom-------Bathroom                          *\n" +
    "*           +             +                                *\n" +
    "*           +             +                                *\n" +
    "*          Hallway     Bedroom    Attic                    *\n" +
    "*           +             +        +                       *\n" +
    "*           +             +        +                       *\n" +
    "*Balcony---Kitchen-----2ndFloor----Hallway----HallwayEnd   *\n" +
    "*           +            +         +           +           *\n" +
    "*           +            +         +           +           *\n" +
    "*           +        LivingRoom  PianoRoom    MasterBedroom*\n" +
    "*           +            +         +                       *\n" +
    "*           +            +         +                       *\n" +
    "*ArtRoom--Bedroom-----Entrance---BabyRoom-----Den          *\n" +
    "* +                                           +            *\n" +
    "* +                                           +            *\n" +
    "*GameRoom                                  WeightRoom      *\n" +
    "************************************************************");
  }
}
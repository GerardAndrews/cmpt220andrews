/*
File: Drive_proj2.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Project 2
Due Date: 5/1/2017
Version 1.0
This file is a class for all items in the text adventure.
it keeps track the item locations, the item descriptions,
and hte item locations.
*/

/*
*__________________________*
*        Items             *
*__________________________*
*-itemLoc: int[]           *
*-items: String[]          *
*-desc: String[]           *
*__________________________*
*+Items(items: int[],      *
*items: String[],          *
*desc: String[])           *  
*                          *
*+getILocs(): int[]        *
*                          *
*+getItems(): String[]     *
*                          *
*+getDescs(): String[]     *
*_________________________ *
*/

public class Items {
  public int[] itemLoc;
  public String[] items;
  public String[] desc;
  public Items(int[] itemLoc, String[] items, String[] desc) {
    this.itemLoc = new int[] {0, 1, 0, 3, 0, 0, 6, 0, 0, 
    9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    this.items = new String[] {" ", "Key", " ", "Map", " ", " ", 
    "Lantern", " ", " ", "Radio", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    this.desc = new String[] {" ", "Could this be to get to other areas?", " ", "Maybe this can be used to navigate the house better.", " ", " ",
    "Maybe this can be used to make rooms more lit.", " ", " ", "Perhaps this can be used to make things less tense", " ", " ", " ", " ", " ", " ", " ",
    " ", " ", " "};
    }
  public int[] getILocs() {
    return itemLoc;
  }
  public String[] getItems() {
    return items;
  }
  public String[] getDescs() {
    return desc;
    }
}
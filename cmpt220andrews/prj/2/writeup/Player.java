/*
File: Drive_proj2.java
Author: Gerard Andrews
Course: CMPT220
Assignment: Project 2
Due Date: 5/1/2017
Version 1.0
This file is a class for a player in the text adventure
It keeps track of how many moves the player has left, his/her score
and his/her current location in-game.
*/

/*
*________________________*
*        Player           *
*_________________________*
*-moves: int              *
*-score: int              *
*-currLoc: int            *
*_________________________*
*+Player(moves: int,      *
*score: int, currLoc: int)*
*                         *
*+getMoves(): int         *
*                         *
*+getScore(): int         *
*                         *
*+getcurrLoc(): int       *
*_________________________*
*/
public class Player {
  public int moves;
  public int score;
  public int currLoc;
  public Player (int moves, int score, int currLoc) {
    this.moves = 50;
    this.score = 0;
    this.currLoc = 0;
  }
  public int getMoves() {
    return moves;
  }
  public int getScore() {
    return score;
  }
  public int getcurrLoc() {
    return currLoc;
  }
}
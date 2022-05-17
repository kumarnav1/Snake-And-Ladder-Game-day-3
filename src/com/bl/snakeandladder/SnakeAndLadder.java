package com.bl.snakeandladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game.");
        int playerStartPosition = 0;
        int numberAfterRolling = (int) Math.floor(Math.random() * 10) % 6 +1;
        System.out.println("Number after rolling the dice by the player: " + numberAfterRolling);
    }
}
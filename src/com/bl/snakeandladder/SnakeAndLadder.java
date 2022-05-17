package com.bl.snakeandladder;

public class SnakeAndLadder {

    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game.");
        int playerStartPosition = 0;
        while (playerStartPosition < WINNING_POSITION) {
            int numberAfterRolling = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Number after rolling the dice by the player: " + numberAfterRolling);
            int checkOptions = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkOptions) {
                case NO_PLAY:
                    System.out.println("Player is not playing therefore stays in the same position");
                    break;
                case LADDER:
                    if (playerStartPosition + numberAfterRolling > 100)
                        break;
                    playerStartPosition += numberAfterRolling;
                    System.out.println("Player got the ladder and moves ahead then position is: " + playerStartPosition);
                    break;
                case SNAKE:
                    playerStartPosition -= numberAfterRolling;
                    if (playerStartPosition < 0)
                        playerStartPosition = 0;
                    System.out.println("Player got snake bite and got behind then position is: " + playerStartPosition);
            }
        }
    }
}
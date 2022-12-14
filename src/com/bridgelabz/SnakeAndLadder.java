package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static final int noPlay = 0;
    static final int ladder = 1;
    static final int snake = 2;
    static int count = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");
        int position = 0;

        while (position < 100) {
            Random random = new Random();
            int dice = random.nextInt(6) + 1;
            ++count;

            System.out.println("dice: " + dice);
            int optCheck = random.nextInt(3);
            System.out.println("optCheck: " + optCheck);

            if ((optCheck == ladder) && (position + dice) <= 100) {
                System.out.println("Ladder");
                position = position + dice;
            } else if (optCheck == snake) {
                System.out.println("Snake");
                position = position - dice;
            } else {
                System.out.println("No Play");
            }

            if (position < 0)
                position = 0;

            System.out.println("position: " + position + "\nDice count " + count);
        }

    }
}
package com.game;

import java.util.*;

public class SnakeAndLadder {
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE = 3;

	public static void main(String[] args) {
		int position1 = 0;
		int position2 = 0;
		int die;
		int choice;
		int dieRoll1 = 0;
		int dieRoll2 = 0;
		int currentPlayer = 1;

		System.out.println("Welcome to Snake And Ladder Game");
		System.out.println("Player 1 is at Position " + position1);
		System.out.println("Player 2 is at Position " + position2);
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String key = "";

		while(!key.equals("q")) {
			if(currentPlayer == 1) {
				System.out.println("Player 1 Turn | Press Enter to Roll the Die | Enter q to Quit");
			} else {
				System.out.println("Player 2 Turn | Press Enter to Roll the Die | Enter q to Quit");
			}
			key = input.nextLine();

			if(!key.equals("q")) {
				die = random.nextInt(7-1)+1;
				choice = random.nextInt(4-1)+1;

				if(currentPlayer == 1) {
					dieRoll1 += 1;
					System.out.println("Die Number is " + die + " | Number of Player 1 Die Rolls = " + dieRoll1);
				} else {
					dieRoll2 += 1;
					System.out.println("Die Number is " + die + " | Number of Player 2 Die Rolls = " + dieRoll2);
				}

				if (choice == NO_PLAY) {
					System.out.println("NO PLAY");
					System.out.println("Player 1 Position = " + position1);
					System.out.println("Player 2 Position = " + position2);
					if(currentPlayer == 1) {
						currentPlayer = 2;
					} else {
						currentPlayer = 1;
					}
				} else if(choice == LADDER) {
					System.out.println("LADDER");
					if(currentPlayer == 1) {
						if(position1 + die <= 100) {
							position1 += die;
						}
						System.out.println("Player 1 Position = " + position1);
						System.out.println("Player 2 Position = " + position2);
						currentPlayer = 2;
						if(position1 == 100) {
							System.out.println("Congratulations !!! Player 1 has Won the Game");
							break;
						}
					} else {
						if(position2 + die <= 100) {
							position2 += die;
						}
						System.out.println("Player 1 Position = " + position1);
						System.out.println("Player 2 Position = " + position2);
						currentPlayer = 1;
						if(position2 == 100) {
							System.out.println("Congratulations !!! Player 2 has Won the Game");
							break;
						}
					}
				} else if(choice == SNAKE) {
					System.out.println("SNAKE");
					if(currentPlayer == 1) {
						position1 -= die;
						if(position1 < 0) {
							position1 = 0;
						}
						System.out.println("Player 1 Position = " + position1);
						System.out.println("Player 2 Position = " + position2);
						currentPlayer = 2;
					} else {
						position2 -= die;
						if(position2 < 0) {
							position2 = 0;
						}
						System.out.println("Player 1 Position = " + position1);
						System.out.println("Player 2 Position = " + position2);
						currentPlayer = 1;
					}
				}
			} else {
				System.out.println("Game Ended");
				break;

			}
		}
	}
}

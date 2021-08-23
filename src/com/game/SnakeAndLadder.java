package com.game;

import java.util.*;

public class SnakeAndLadder {
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE = 3;

	public static void main(String[] args) {
		int position = 0;
		int die;
		int choice;
		int die_roll = 0;
		
		System.out.println("Welcome to Snake And Ladder Game");
		System.out.println("Player is at Position " + position);
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String key = "";
		
		while(!key.equals("q")) {
			System.out.println("Press Enter to Roll the Die | Enter q to Quit");
			key = input.nextLine();
			
			if(!key.equals("q")) {
				die = random.nextInt(7-1)+1;
				die_roll += 1;
				System.out.println("Die Number is " + die + " | Number of Die Rolls = " + die_roll);
				choice = random.nextInt(4-1)+1;
				
				if (choice == NO_PLAY) {
					System.out.println("NO PLAY");
					System.out.println("Player is at Position " + position);
				} else if(choice == LADDER) {
					System.out.println("LADDER");
					if(position + die <= 100) {
						position += die;
					}
					System.out.println("Player is at Position " + position);
					if(position == 100) {
						System.out.println("Congratulations !!! You Won");
						break;
					}
				} else if(choice == SNAKE) {
					System.out.println("SNAKE");
					position -= die;
					if(position < 0) {
						position = 0;
					}
					System.out.println("Player is at Position " + position);
				}
			} else {
				System.out.println("Game Ended");
				break;
				
			}
		}
	}

}

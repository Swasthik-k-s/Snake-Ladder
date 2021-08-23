package com.game;

import java.util.*;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int position = 0;
		int die;
		
		System.out.println("Welcome to Snake And Ladder Game");
		System.out.println("Player is at Position " + position);
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String key = "";
		
		while(!key.equals("q")) {
			System.out.println("Enter any key and Enter to Roll the Die | Enter q to Quit");
			key = input.next();
			
			if(!key.equals("q")) {
				die = random.nextInt(7-1)+1;
				position += die;
				System.out.println("Die Number is " + die);
				System.out.println("Player is at Position " + position);
			} else {
				System.out.println("Game Ended");
				break;
				
			}
		}
	}

}

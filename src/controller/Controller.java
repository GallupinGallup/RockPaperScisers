package controller;

import java.util.Scanner;

import modle.Random;

public class Controller {
	private Scanner gameScanner;
	private Random answer;
	private boolean playing = false;

	public Controller() {
		gameScanner = new Scanner(System.in);
		answer = new Random();
	}

	public void start() {
		while (playing) {
			System.out.println("Do you play rock, paper, scissors?");
			String userInput = gameScanner.nextLine();
			if (userInput.equalsIgnoreCase("yes")) {
				System.out.println("Type what you want to play!");
				userInput = gameScanner.nextLine();
				if (answer.getAnswer().equalsIgnoreCase(userInput)) {
					System.out.println("I chose " + answer.getAnswer() + " and you chose " + userInput);
					System.out.println("We tied");
				} else {
					if (userInput.equalsIgnoreCase("Rock")) {
						if (answer.getAnswer().equalsIgnoreCase("Paper")) {
							System.out.println("I chose " + answer.getAnswer() + " and you chose " + userInput);
							System.out.println("I won!");
						} else if (answer.getAnswer().equalsIgnoreCase("Scissors")) {
							System.out.println("I chose " + answer + " and you chose " + userInput);
							System.out.println("You won!");
						}
					} else if (userInput.equalsIgnoreCase("Paper")) {
						if (answer.getAnswer().equalsIgnoreCase("Rock")) {
							System.out.println("I chose " + answer.getAnswer() + " and you chose " + userInput);
							System.out.println("You won!");
						} else if (answer.getAnswer().equalsIgnoreCase("Scissors")) {
							System.out.println("I chose " + answer + " and you chose " + userInput);
							System.out.println("I won!");
						}
					} else if (userInput.equalsIgnoreCase("Scissors")) {
						if (answer.getAnswer().equalsIgnoreCase("Rock")) {
							System.out.println("I chose " + answer.getAnswer() + " and you chose " + userInput);
							System.out.println("I won!");
						} else if (answer.getAnswer().equalsIgnoreCase("Paper")) {
							System.out.println("I chose " + answer.getAnswer() + " and you chose " + userInput);
							System.out.println("You won!");
						}
					} else {
						System.out.println("I didn't understand what you said there.");
					}
				}
			} else {
				System.out.println("sad");
				playing = false;
			}
		}
	}

}

package main.application;

import java.util.Scanner;

public class simpleCLI {
	
	private String prompt = ">> ";
	
	public void commandLoop() {
		Scanner scanner = new Scanner(System.in);
		boolean looping = true;
		
		while(looping) {
			System.out.print(prompt);
			String command = scanner.nextLine();
			
			switch(command) {
			case "exit":
			case "quit":
				looping = false;
				break;
			default:
				looping = true;
				break;
			}
		}
		
		scanner.close();
	}

}

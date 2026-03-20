
package com.main;

import com.controller.*;
import com.trainconsist.*;

public class Main {

	public static void main(String[] args) {

		Train train = new Train();
		MainController mainController = new MainController();

		mainController.displayHeader(); //displaying header

		boolean running = true;
		
		while(running) { 
			int choice = mainController.showMenuAndGetChoice(); // menu
			switch(choice) {
			
			case 1:
				mainController.assignCargotoBogie(); // adding bogie and checking cargo safety
				break;
			
			case 2:
				running = false;
				mainController.displayPassengerBogies(train);
				break;
				
			default:
				System.out.println("Invalud choice");
			}
		}
	}
}

package com.main;

import com.controller.*;
import com.trainconsist.*;

public class Main {

	public static void main(String[] args) throws IllegalStateException {

		Train train = new Train();
		MainController mainController = new MainController();

		mainController.displayHeader(); //displaying header

		boolean running = true;
		
		while(running) { 
			int choice = mainController.showMenuAndGetChoice(); // menu
			switch(choice) {
			
			case 1:
				mainController.addBogies(train); // adding bogie 
				break;
			
			case 2:
				mainController.displayBogies(train); // printing bogies
				break;
				
			case 3:
				mainController.searchBogieById(train); // performing binary search
				break;
			
			case 4:
				running = false;
				mainController.displayBogies(train);
				break;
	
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}

package com.main;

import com.controller.*;
import com.trainconsist.*;

public class Main {

	public static void main(String[] args) {
		
		Train train = new Train();
		MainController mainController = new MainController();
		
		mainController.displayHeader();
		boolean running = true;
		// Menu 
		while(running) {
			int choice = mainController.showMenuGetChoice(); //getting user choice
			
			switch(choice) {
			case 1:
				mainController.addBogies(train); // adding bogies 
				break;
			case 2:
				mainController.displayUnsorted(train); // unsorted bogies
				break;
			case 3:
				mainController.displayFiltered(train); // sorted bogies
				break;
			case 4:
					// display final consist
				running = false;
				break;
			default:
				System.out.println("Invalid choice");
			}
			
		}
		
	}
}
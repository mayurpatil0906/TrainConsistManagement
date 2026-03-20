

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
				mainController.removeBogies(train); //removing bogies
				break;
			case 3:
				mainController.checkBogie(train); //checking if a bogie exist in the train consist
				break;
			case 4:
				mainController.displayConsist(train); // printing final consist
				running = false;
				break;
			default:
				System.out.println("Invalid choice");
			}
			
		}
		
	}
}
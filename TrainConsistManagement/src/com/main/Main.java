

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
				mainController.addBogieAtFirst(train); // adding bogies at first
				break;
			case 3:
				mainController.addBogieAtLast(train); //adding bogies at last
				break;
			case 4:
				mainController.addBogieAtIndex(train); // adding bogies at any position
				break;
			case 5:
				mainController.removeBogies(train); // remove bogies
				break;
			case 6:
				mainController.removeBogieFromFirst(train); // remove from first
				break;
			case 7:
				mainController.removeBogieFromLast(train); // remove from last
				break;
			case 8:
				mainController.checkBogie(train); // check if bogie exist
				break;
			case 9:
				mainController.displayConsist(train); // display final consist
				running = false;
				break;
			default:
				System.out.println("Invalid choice");
			}
			
		}
		
	}
}
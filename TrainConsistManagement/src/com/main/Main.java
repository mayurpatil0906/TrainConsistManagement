
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
			int choice = mainController.showMenuAndGetChoice(); // taking user choice
			switch(choice) {
				
			case 1:
				mainController.addGoodsBogie(train); //adding bogies
				break;
			case 2:
				mainController.displayGoodsBogies(train); // printing bogies and their cargo
				break;
			case 3:
				mainController.checkSafety(train); // checking safety compliance
				break;
			case 4:
				mainController.displayGoodsBogies(train); // logout
				running = false;
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}
}
package com.controller;
import java.util.*;

import com.trainconsist.*;
import java.util.Scanner;


// Main controller for the application
public class MainController {

	Scanner sc = new Scanner(System.in);
	//Printing header
	public void displayHeader() {
		System.out.println("===========================================");
		System.out.println("    ===Train Consist Management App===     ");
		System.out.println("===========================================");

	}
	
	//Initializing the application with by default values
	public int showMenuGetChoice() {
		
		System.out.println("1. Add Bogies");
		System.out.println("2. Remove bogies");
		System.out.println("3. View if Bogie Exists");
		System.out.println("4. Logout");
		System.out.print("5. Enter your choice : ");
		
		int choice = sc.nextInt();
		sc.nextLine(); //consumes the new line character
		return choice; 
	}
	
	// method for adding multiple bogies together, duplicates will be ignored automatically
	public void addBogies(Train train) {
		System.out.print("Enter passenger bogie ID's to add (Comma separated) : ");
		String input = sc.nextLine();
		if(!input.trim().isEmpty()) {
			String[] bogies = input.split(",");
			for(String bogie : bogies) {
				train.addBogie(bogie);
			}
		}
		System.out.println("After adding bogies: ");
		System.out.println("Passenger Bogies -> "+train.getTrainConsist());
	}
	
	// method for removing multiple bogies together
	public void removeBogies(Train train) {
		System.out.print("Enter passenger bogie ID's to remove (Comma separated) : ");
		String input = sc.nextLine();
		if(!input.trim().isEmpty()) {
			String[] bogies = input.split(",");
			for(String bogie : bogies) {
				if(train.containsBogie(bogie)) train.removeBogie(bogie);
				else System.out.println("Bogies "+ bogie + " Does not Exist");
				
			}
		}
		System.out.println("After removing bogies: ");
		System.out.println("Passenger Bogies -> "+train.getTrainConsist());
	}
	
	// checking if a bogie exists or not
	public void checkBogie(Train train) { 
		System.out.print("Enter passenger bogie ID to check : ");
		String bogie = sc.nextLine().trim();
		boolean exist = train.containsBogie(bogie);
		
		System.out.println("Contains Bogie? -> "+exist);
	}
	
	// displaying final consist
	public void displayConsist(Train train) {
		System.out.println("Final Train Consist : ");
		System.out.println(train.getTrainConsist());
	}
}
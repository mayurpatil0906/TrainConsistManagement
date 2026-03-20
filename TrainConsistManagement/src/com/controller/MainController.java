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
		System.out.println("2. Add bogie at first position");
		System.out.println("3. Add bogie at last position");
		System.out.println("4. Add bogie at index");
		System.out.println("5. Remove Bogie");
		System.out.println("6. Remove Bogie from first position");
		System.out.println("7. Remove Bogie from last");
		System.out.println("8. View if Bogie Exists");
		System.out.println("9. Logout");
		System.out.print("\nEnter your choice : ");
		
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
	
	// method for adding bogie at first pos
	public void addBogieAtFirst(Train train) {
		System.out.print("Enter passenger bogie ID to add : ");
		String bogie = sc.nextLine();
		if(!bogie.trim().isEmpty()) {
			train.addFirst(bogie);
		}
		System.out.println("After adding bogies: ");
		System.out.println("Passenger Bogies -> "+train.getTrainConsist());
	}
	
	// method for adding bogie at last pos
	public void addBogieAtLast(Train train) {
		System.out.print("Enter passenger bogie ID to add : ");
		String bogie = sc.nextLine();
		if(!bogie.trim().isEmpty()) {
			train.addLast(bogie);
		}
		System.out.println("After adding bogies: ");
		System.out.println("Passenger Bogies -> "+train.getTrainConsist());
	}
	
	// method for adding bogie at any pos
	public void addBogieAtIndex(Train train) {
		System.out.print("Enter passenger bogie ID to add : ");
		String bogie = sc.nextLine();
		System.out.print("Enter the position to add : ");
		int index = sc.nextInt();
		if(!bogie.trim().isEmpty() && index < train.getBogieCount()) {
			train.addAtIndex(index, bogie);
			System.out.println("After adding bogies: ");
			System.out.println("Passenger Bogies -> "+train.getTrainConsist());
		}
		else {
			System.out.println("Index is not valid");
		}
		
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
	
	// method for removing bogie from first
	public void removeBogieFromFirst(Train train) {
		train.removeFirst();
		System.out.println("After adding bogies: ");
		System.out.println("Passenger Bogies -> "+train.getTrainConsist());
	}
	
	// method for removing bogie from last
	public void removeBogieFromLast(Train train) {
		train.removeLast();
		System.out.println("After adding bogies: ");
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
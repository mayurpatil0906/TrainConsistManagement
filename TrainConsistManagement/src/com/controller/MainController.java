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
		
		System.out.println("1. Map Bogies");
		System.out.println("2. Remove Bogie");
		System.out.println("3. View bogie and their capacities");
		System.out.println("4. Check if bogie exists");
		System.out.println("5. Logout");
		System.out.print("\nEnter your choice : ");
		
		int choice = sc.nextInt();
		sc.nextLine(); //consumes the new line character
		return choice; 
	}
	
	// method for adding bogies and their capacity
	public void addBogies(Train train) {
		System.out.print("Enter passenger bogie ID's and Capacity to add : ");
		String bogie = sc.nextLine();
		String capacity = sc.nextLine();
		if(!bogie.trim().isEmpty() && !capacity.trim().isEmpty()) {
				train.mapBogieCapacity(bogie,capacity);
				System.out.println("After adding bogies: ");
				System.out.println("Passenger Bogies -> "+train.getTrainConsist());
		}
		else {
			System.out.println("Invalid input");
		}
		
	}
	
	
	// method for removing multiple bogies together
	public void removeBogies(Train train) {
		System.out.print("Enter passenger bogie ID's to remove : ");
		String input = sc.nextLine();
		if(!input.trim().isEmpty()) {
			String[] bogies = input.split(",");
			for(String bogie : bogies) {
				if(train.containsBogie(bogie)) train.removeBogieCapacity(bogie);
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
		System.out.println("Bogie Capacity : ");
		for(Map.Entry<String, String> entry : train.getTrainConsist().entrySet()) {
			System.out.println(entry.getKey() +" -> "+entry.getValue());
		}
		System.out.println();
	}
}
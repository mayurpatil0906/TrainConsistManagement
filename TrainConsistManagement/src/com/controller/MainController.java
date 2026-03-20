package com.controller;
import java.util.*;

import com.trainconsist.*;
import com.trainconsist.Train.Bogie;


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
		System.out.println("2. View all bogies");
		System.out.println("3. Group bogies by type");
		System.out.println("4. Logout");
		System.out.print("\nEnter your choice : ");
		
		int choice = sc.nextInt();
		sc.nextLine(); //consumes the new line character
		return choice; 
	}
	
	// method for adding bogies and their capacity
	public void addBogies(Train train) {
		System.out.print("Enter passenger bogie's ID : ");
		String bogie = sc.nextLine();
		System.out.print("Enter passenger bogie's capacity : ");
		int capacity = sc.nextInt();
		if(!bogie.trim().isEmpty() && capacity>0) {
				train.addBogie(bogie,capacity);
				System.out.println("Added "+bogie+" with capacity "+ capacity);
		}
		else {
			System.out.println("Invalid input");
		}
		
	}
	
	// method for displaying all bogies
	public void displayAll(Train train) {
		System.out.println("Bogies :  ");
		for(Train.Bogie bogie : train.getBogies()) {
			System.out.println(bogie);
		}
	}
	
	// method for displaying grouped bogies 
	public void displayGrouped(Train train) {
		System.out.println("\nAfter Grouping : ");
		Map<String , List<Bogie>> groupedBogies=  train.groupBogiesByType();
		for(Map.Entry<String,List<Bogie>> entry : groupedBogies.entrySet()) {
			System.out.println("\nBogie type : "+entry.getKey());
			for(Train.Bogie bogie : entry.getValue()) {
				System.out.println("Capacity -> "+bogie.getCapacity());
			}
		}
	}
	

}
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
		System.out.println("3. View bogies after filtering");
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
	
	// method for displaying unsorted List
	public void displayUnsorted(Train train) {
		System.out.println("Before Sorting : ");
		for(Train.Bogie bogie : train.getBogies()) {
			System.out.println(bogie);
		}
	}
	
	// method for displaying sorted List 
	public void displayFiltered(Train train) {
		System.out.println("\nAfter filtering : ");
		List<Train.Bogie> filteredList=  train.filterBogiesByCapacity();
		filteredList.forEach(System.out::println);
	}
	

}
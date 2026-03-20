package com.controller;
import java.util.*;

import com.trainconsist.*;

// main controller class
public class MainController {
	
    Scanner sc = new Scanner(System.in);
    
    public void displayHeader() {
        System.out.println("====================================================");
        System.out.println("        ===Train Consist Management App==           ");
        System.out.println("==================================================\n");
    }
    
    // taking user input 
    public int showMenuAndGetChoice() { 
        System.out.println("\n1. Add bogies");
        System.out.println("2. View Bogies");
        System.out.println("3. Sort bogie by Bogie ID");
        System.out.println("5. Logout");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    
    //adding bogies
    public void addBogies(Train train) {
    	System.out.print("Enter the bogie ID : ");
    	String type = sc.nextLine();
    	
    	System.out.print("Enter the capacity : ");
    	int capacity = sc.nextInt();
    	
    	train.addBogie(type, capacity);
    	System.out.println(type+" -> "+capacity+" added");
    }
    
    // linear array based searching
    public void searchBogieById(Train train) throws IllegalStateException {
    	System.out.print("Enter the Bogie Id to search : ");
    	String bogieId = sc.nextLine();
    	try {
        	Train.Bogie foundBogie = train.searchById(bogieId);
        	System.out.println("Found bogie "+foundBogie.getType()+" with capacity "+foundBogie.getCapacity());
        	
    	}
    	catch (IllegalStateException e) {
        	System.out.println("\nError : "+e.getMessage());
    	}
    }

    // displaying all bogies
    public void displayBogies(Train train) {
        System.out.println("\nBogies in Train Consist :"); 
        for (Train.Bogie bogie : train.getBogie()) {
            System.out.println(bogie.getType()+" -> "+bogie.getCapacity());
        }
    }
    

}
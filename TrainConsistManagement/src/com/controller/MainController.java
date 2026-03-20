package com.controller;
import java.util.*;
import java.util.stream.Collectors;

import com.trainconsist.*;

public class MainController {
	
    Scanner sc = new Scanner(System.in);
    
    public void displayHeader() {
        System.out.println("====================================================");
        System.out.println("        ===Train Consist Management App==           ");
        System.out.println("==================================================\n");
    }
    
    // taking user input 
    public int showMenuAndGetChoice() { 
        System.out.println("1. Assign bogies");
        System.out.println("2. View Bogies");
        System.out.println("3. View Sorted Bogies (wrt capacity)");
        System.out.println("4. Logout");
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
    // sortig bogies on the basis of their capacity
     public void performBubbleSort(Train train) { 
    	 if(train.getBogie().isEmpty()) {
    		 System.out.println("No bogie to sort");
    	 }
    	 train.bubbleSortByCapacity();
    	 System.out.println("\nAfter sorting\n");
    	 displayBogies(train);
     }

    // displaying all bogies
    public void displayBogies(Train train) {
        System.out.println("\nBogies in Train Consist :"); 
        for (Train.Bogie bogie : train.getBogie()) {
            System.out.println(bogie.getType()+" -> "+bogie.getCapacity());
        }
    }

}
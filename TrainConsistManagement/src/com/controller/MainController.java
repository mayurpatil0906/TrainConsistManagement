package com.controller;
import java.util.*;
import java.util.stream.Collectors;

import com.trainconsist.*;


public class MainController {
	
    Scanner sc = new Scanner(System.in);
    
    public void displayHeader() {
        System.out.println("==================================================");
        System.out.println("         ==Train Consist Management App==           ");
        System.out.println("==================================================\n");
    }
    
    // taking user input 
    public int showMenuAndGetChoice() {
        System.out.println("1. Add passenger Bogie");
        System.out.println("2. View passenger Bogies");
        System.out.println("3. Logout");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    
    // adding passenger bogie
    public void addPassengerBogie(Train train) {
        System.out.print("Enter bogie ID : ");
        String trainId = sc.nextLine();

        System.out.print("Enter capacity : ");
        String cap = sc.nextLine();

        // catching errors
        try {
        	int capacity =Integer.parseInt(cap);
        	train.addBogie(trainId, capacity);
            System.out.println("Added Passenger Bogie: " + trainId + " -> " + capacity);
        }
        // if capacity in non integer
        catch (NumberFormatException e) {
        	System.out.println("Error : Capacity should be an integer");
        }
        // if capacity is <=0
        catch (InvalidCapacityException e) {
        	System.out.println("\nError : "+e.getMessage());
        	
        }
        
    }

    // displaying all bogies
    public void displayPassengerBogies(Train train) {
        System.out.println("\nPassenger Bogies in Train :"); 
        for (Train.Bogie bogie : train.getBogie()) {
            System.out.println(bogie);
        }
    }

}
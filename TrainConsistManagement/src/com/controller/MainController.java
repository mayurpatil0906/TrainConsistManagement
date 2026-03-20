package com.controller;
import java.util.*;
import java.util.stream.Collectors;

import com.trainconsist.*;
import com.trainconsist.Train.GoodsBogie; 

public class MainController {
	
    Scanner sc = new Scanner(System.in);
    
    public void displayHeader() {
        System.out.println("====================================================");
        System.out.println("        ===Train Consist Management App==           ");
        System.out.println("==================================================\n");
    }
    
    // taking user input 
    public int showMenuAndGetChoice() {
        System.out.println("1. Assign cargo to goods bogie");
        System.out.println("2. Logout");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    
    // adding passenger bogie
    public void assignCargotoBogie() {
        System.out.print("Enter bogie shape (Rectangular,Box,Cylindrical) : ");
        String shape = sc.nextLine();
        Train.GoodsBogie bogie = new Train.GoodsBogie(shape);
        
        System.out.print("Enter cargo to assign (Petroleum, Coal) : ");
        String cargo = sc.nextLine();
        bogie.assignCargo(cargo);

        
    }

    // displaying all bogies
    public void displayPassengerBogies(Train train) {
        System.out.println("\nPassenger Bogies in Train :"); 
        for (Train.GoodsBogie bogie : train.getBogie()) {
            System.out.println(bogie);
        }
    }

}
package com.controller;
import java.util.Scanner;

import com.trainconsist.*;


public class MainController {
	
    Scanner sc = new Scanner(System.in);
    
    public void displayHeader() {
        System.out.println("==================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==================================================\n");
    }

    public int showMenuAndGetChoice() {
        System.out.println("1. Add Goods Bogie");
        System.out.println("2. View Goods Bogies");
        System.out.println("3. Check Safety Compliance");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");

        
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public void addGoodsBogie(Train train) {
        System.out.print("Enter bogie type (Cylindrical,Open,Box) : ");
        String type = sc.nextLine();

        System.out.print("Enter cargo (Petroleum,Coal,Grain) : ");
        String cargo = sc.nextLine();

        train.addGoodsBogie(type, cargo);
        System.out.println("Added Goods Bogie: " + type + " -> " + cargo);
    }

    public void displayGoodsBogies(Train train) {
        System.out.println("\nGoods Bogies in Train :");
        for (Train.GoodsBogie bogie : train.getGoodsBogie()) {
            System.out.println(bogie);
        }
    }

    public void checkSafety(Train train) {
        boolean isSafe = train.isSafetyCompliant();
        System.out.println("\nSafety Compliance Status : " + isSafe);
        if (isSafe) {
            System.out.println("Train formation is SAFE");
        } else {
            System.out.println("Train formation is NOT SAFE");
        }
    }

}
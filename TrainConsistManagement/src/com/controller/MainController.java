package com.controller;
import java.util.*;

import com.trainconsist.*;


// Main controller for the application
public class MainController {

	
	//Initializing the application with by default values
	public void Initialize(Train train) {
		
		System.out.println("===========================================");
		System.out.println("    ===Train Consist Management App===     ");
		System.out.println("===========================================");

		System.out.println("\nTrain initialized successfully");
		System.out.println("Initial Bogie Count : "+train.getBogieCount());
		System.out.println("Current train consist : "+train.getTrainConsist());
		
	}
}
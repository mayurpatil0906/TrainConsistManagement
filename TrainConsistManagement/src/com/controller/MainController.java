package com.controller;
import java.util.*;

import com.trainconsist.*;

// Main controller for the application
public class MainController {

	Scanner sc = new Scanner(System.in);
	//Printing header
	public void displayHeader() {
		System.out.println("===========================================");
		System.out.println("    ===Train Consist Management App===     ");
		System.out.println("===========================================");

	}
	
	
	// Validating Train ID and Cardo Code
	public void performValidation(Train train) {
		
		System.out.print("Enter the Train Id (TRN-XXXX) : ");
		String trainId = sc.nextLine();
		
		System.out.print("Enter the Cargo Code (PET-AA) : ");
		String cargoCode = sc.nextLine();
		
		boolean isTrainIdValid = train.validateTrainId(trainId);
		boolean isCargoCodeValid = train.validateCargoCode(cargoCode);
		
		System.out.println("Validation result -> ");
		System.out.print("Train Id : "+isTrainIdValid);
		System.out.print("\nCargo Code : "+ isCargoCodeValid);
	}

}
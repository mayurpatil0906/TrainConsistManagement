package com.trainconsist;

// exception class of invalid capacity of bogies
public class CargoSafetyException extends Exception{
	
	public CargoSafetyException(String message) {
		super(message);
	}

}
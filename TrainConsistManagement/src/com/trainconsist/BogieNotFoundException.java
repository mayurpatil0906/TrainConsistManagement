package com.trainconsist;

// exception class for no bogies found
public class BogieNotFoundException extends Exception{
	
	public BogieNotFoundException(String message) {
		super(message);
	}

}
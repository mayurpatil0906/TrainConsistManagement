package com.trainconsist;

import java.util.*;

//Train class for storing list of bogies attached to the train

public class Train {
	
	private List<String> passengerBpgies; //list of bogies
	
	public Train() {
		this.passengerBpgies = new ArrayList<>(); // initializing the list
	}
	
	public int getBogieCount() {
		return passengerBpgies.size();   //get number of bogies
	}
	
	public List<String> getTrainConsist(){
		return passengerBpgies; // get list of bogies
	}
	
	public void addBogie(String bogie) { //adding bogie
		passengerBpgies.add(bogie.trim());
	}
	
	public void removeBogie(String bogie) { //removing bogie
		passengerBpgies.remove(bogie.trim());
	}
	
	public boolean containsBogie(String bogie) { // checking if bogie exists
		return passengerBpgies.contains(bogie);
	}
}
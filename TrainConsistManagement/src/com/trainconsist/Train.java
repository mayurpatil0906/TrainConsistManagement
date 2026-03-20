package com.trainconsist;

import java.util.*;

//Train class for storing list of bogies attached to the train

public class Train {
	
	private Set<String> passengerBogies; // set of bogies for avoiding duplicates
	
	public Train() {
		this.passengerBogies = new HashSet<>(); // initializing the list
	}
	
	public int getBogieCount() {
		return passengerBogies.size();   //get number of bogies
	}
	
	public Set<String> getTrainConsist(){
		return passengerBogies;   // get list of bogies
	}
	
	public void addBogie(String bogie) {   //adding bogie
		passengerBogies.add(bogie.trim());
	}
	
	public void removeBogie(String bogie) {   //removing bogie
		passengerBogies.remove(bogie.trim());
	}
	
	public boolean containsBogie(String bogie) {   // checking if bogie exists
		return passengerBogies.contains(bogie); 
	}
}
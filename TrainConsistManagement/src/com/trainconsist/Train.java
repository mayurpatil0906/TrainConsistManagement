package com.trainconsist;

import java.util.*;

//Train class for storing list of bogies attached to the train

public class Train {
	
	private Map<String,String> bogieCapacity; // map of bogies and their capacities 
	
	public Train() {
		this.bogieCapacity = new HashMap<>(); // initializing the list
	}
	
	public int getBogieCount() {
		return bogieCapacity.size();   //get number of bogies
	}
	
	public Map<String,String> getTrainConsist(){
		return bogieCapacity;   // get list of bogies 
	}
	
	public void mapBogieCapacity(String bogie, String capacity) {   //adding bogie
		bogieCapacity.put(bogie.trim(),capacity);
	}
	
	public void removeBogieCapacity(String bogie) {   //removing bogie
		bogieCapacity.remove(bogie.trim());
	}
	
	public boolean containsBogie(String bogie) {
		return bogieCapacity.containsKey(bogie);
	}
}
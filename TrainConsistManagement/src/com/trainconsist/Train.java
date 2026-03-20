package com.trainconsist;

import java.util.*;

//Train class for storing list of bogies attached to the train

public class Train {

	// Inner class GoodsBogie
	public static class Bogie{
		
		private String type;
		private int capacity;

		public Bogie(String type, int capacity){
			this.type = type;
			this.capacity = capacity;
		}

		public String getType() {
			return type;
		} 

		public int getCapacity() {
			return capacity; 
		}
	}

	private List<Bogie> bogies; // list of object of Bogies

	public Train() {
		this.bogies = new ArrayList<>();
	}

	public void addBogie(String type, int capacity){ // add objects to the list
		bogies.add(new Bogie(type, capacity));  
	}

	// array based searching
	public Bogie searchById(String bogieId) throws BogieNotFoundException{ 
		boolean isFound = false;
		for (Train.Bogie bogie : getBogie()) {
            if(bogie.getType().equalsIgnoreCase(bogieId)) {
            	isFound = true;
            	return bogie;
            }
        } 
		if(!isFound) {
			throw new BogieNotFoundException("No bogie found");
		}
		return null;
				
	}
	public List<Bogie> getBogie(){  
		return bogies;
	}

}
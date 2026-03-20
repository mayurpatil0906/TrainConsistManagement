package com.trainconsist;

import java.util.*;
import java.util.stream.*;

//Train class for storing list of bogies attached to the train

public class Train {

	// Inner class GoodsBogie
	public static class Bogie{
		private String type;
		private int capacity;
		
		public Bogie(String type, int capacity) throws InvalidCapacityException{
			
			if(capacity<=0) {
				throw new InvalidCapacityException("Capacity must be greater than 0");
			}
			this.type = type;
			this.capacity = capacity;
		}
		
		public String getType() {
			return type;
		} 
		
		public int getCapacity() {
			return capacity;
		}
		
		public String toString() {
			return type+" -> "+capacity;
		}
	}
	
	private List<Bogie> bogies; // list of object of Bogies
	
	public Train() {
		this.bogies = new ArrayList<>();
	}
	
	public void addBogie(String type, int capacity) throws InvalidCapacityException{ // add objects to the list
		bogies.add(new Bogie(type,capacity)); 
	}
	
	public List<Bogie> getBogie(){  
		return bogies;
	}

}
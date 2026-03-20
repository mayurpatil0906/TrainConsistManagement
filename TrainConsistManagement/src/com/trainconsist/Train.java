package com.trainconsist;

import java.util.*;
import java.util.stream.*;

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
	
	public List<Bogie> getBogie(){  
		return bogies;
	}
	
	public void bubbleSortByCapacity() { // bubble sort algorithm
		int size = bogies.size();
		
		// outer loop for number of passes
		for(int i=0;i<size-1;i++) {
			
			//inner loop for comparing adjacent elements
			for(int j=0;j<size-i-1;j++) {
				if(bogies.get(j).getCapacity() > bogies.get(j+1).getCapacity()) {
					// swap the elements
					Bogie temp = bogies.get(j);
					bogies.set(j, bogies.get(j+1));
					bogies.set(j+1, temp);
				}
			}
			
		}
	}
}
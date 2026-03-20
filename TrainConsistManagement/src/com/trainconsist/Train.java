package com.trainconsist;

import java.util.*;
import java.util.stream.Collectors;

//Train class for storing list of bogies attached to the train

public class Train {
	
	// inner class Bogie 
	public static class Bogie{
		private String name;
		private int capacity;
		
		public Bogie(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}
		
		private String getName() {
			return name;
		}
		
		public int getCapacity() {
			return capacity;
		}
		
		//Override
		public String toString() {
			return name+" -> "+capacity;
		}
	}
	
	private List<Bogie> bogies; // List of bogies and their capacities 
	
	public Train() {
		this.bogies = new ArrayList<>(); // initializing the list
	}
	
	public void addBogie(String name, int capacity) {
		bogies.add(new Bogie(name,capacity)); 
	}
	
	public List<Bogie> getBogies(){
		return bogies;
	}
	
	public List<Bogie> filterBogiesByCapacity() { 
		return bogies.stream().filter(b -> b.capacity > 60).collect(Collectors.toList());   
	}
}
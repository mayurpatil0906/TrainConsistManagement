package com.trainconsist;

import java.util.*;

//Train class for storing list of bogies attached to the train

public class Train {
	
	private LinkedHashSet<String> passengerBogies; // set of bogies for avoiding duplicates
	
	public Train() {
		this.passengerBogies = new LinkedHashSet<>(); // initializing the list
	}
	
	public int getBogieCount() {
		return passengerBogies.size();   //get number of bogies
	}
	
	public LinkedHashSet<String> getTrainConsist(){
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
	
	public void addFirst(String bogie) { //adding bogie at first after deleting the bogie for maintaining uniqueness
		List<String> tempList = new ArrayList<>(passengerBogies);
		tempList.remove(bogie);
		tempList.add(0, bogie);
		passengerBogies.clear();
		passengerBogies.addAll(tempList);
	}
	
	// adding bogie at last
	public void addLast(String bogie) {
		passengerBogies.remove(bogie);
		passengerBogies.add(bogie.trim());
	}
	
	
	// adding bogie in between
	public void addAtIndex(int index, String bogie) {
		List<String> temp = new ArrayList<>(passengerBogies);
		temp.remove(bogie);
		if(index >=0 && index <=temp.size()) {
			temp.add(index,bogie.trim());
		}
		else {
			temp.add(bogie.trim());
		}
		
		passengerBogies.clear();
		passengerBogies.addAll(temp);
	}
	
	//removing first bogie
	public void removeFirst() {
		if(!passengerBogies.isEmpty()) {
			Iterator<String> iterator = passengerBogies.iterator(); 
			iterator.next();
			iterator.remove();
			
		}
	}
	
	// removing last bogie
	public void removeLast() {
		if(!passengerBogies.isEmpty()) {
			List<String> temp = new ArrayList<>(passengerBogies);
			temp.remove(temp.size()-1);
			passengerBogies.clear();
			passengerBogies.addAll(temp);
		}
	}
	
	
}
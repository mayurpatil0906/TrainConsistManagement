package com.trainconsist;

import java.util.*;

//Train class for storing list of bogies attached to the train

public class Train {
	
	private List<String> trainConsist; //list of bogies
	
	public Train() {
		this.trainConsist = new ArrayList<>(); // initializing the list
	}
	
	public int getBogieCount() {
		return trainConsist.size();   //get number of bogies
	}
	
	public List<String> getTrainConsist(){
		return trainConsist; // get list of bogies
	}
}